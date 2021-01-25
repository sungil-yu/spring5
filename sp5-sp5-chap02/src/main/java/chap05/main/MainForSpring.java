package chap05.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap03.config.AppCtx;
import chap04.spring.ChangePasswordService;
import chap05.exception.AlreadyExistingMemberException;
import chap05.spring.MemberRegisterService;
import chap05.spring.RegisterRequest;

public class MainForSpring {

	
	private static ApplicationContext ctx = null;
	
	public static void main(String[] args) throws IOException {
		
		ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("명령어를 입력하세요");
			String command = reader.readLine();
			
			if(command.equalsIgnoreCase("exit")) {
				System.out.println("종료");
				break;
			}
			
			if (command.startsWith("new ")) {
				processNewCommand(command.split(" "));
				continue;
			}else if (command.startsWith("change ")){
				processChangeCommand(command.split(" "));
				continue;
			}
			
			printHelp();
			
		}
		
	}

	private static void printHelp() {

		System.out.println();
		System.out.println("잘못된 명령어 입니다.");
		System.out.println("사용법");
		System.out.println("new e-mail name pwd confirmPwd");
		System.out.println("change email nowPwd changePwd");
		System.out.println();
		
	}

	private static void processChangeCommand(String[] args) {
		if(args.length != 4){
			printHelp();
			return;
		}
		ChangePasswordService changePwdSvc = 
				ctx.getBean(ChangePasswordService.class);
		
	}

	private static void processNewCommand(String[] args) {

		if(args.length != 5){
			printHelp();
			return;
		}
		MemberRegisterService regSvc = ctx.getBean(MemberRegisterService.class);
		RegisterRequest req = new RegisterRequest(args[1],args[2],args[3],args[4]);
		
		if (!req.isPasswordEqualToConfirmPassword()) {
			System.out.println("확인 비밀번호랑 일치하지 않습니다.");
			return;
		}
		
		try {
			regSvc.regist(req);
			System.out.println("등록 되었습니다.");
		}catch (AlreadyExistingMemberException e) {
			System.out.println("이미 존재하는 이메일 입니다.\n");
		}
	}

}
