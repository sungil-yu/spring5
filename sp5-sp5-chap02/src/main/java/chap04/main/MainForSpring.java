package chap04.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap03.config.AppCtx;

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
		// TODO Auto-generated method stub
		
	}

	private static void processChangeCommand(String[] args) {
		if(args.length != 4){
			printHelp();
			return;
		}
		
	}

	private static void processNewCommand(String[] args) {

		if(args.length != 5){
			printHelp();
			return;
			
		}
		
	}

}
