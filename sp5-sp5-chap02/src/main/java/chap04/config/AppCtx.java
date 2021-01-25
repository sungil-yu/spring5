package chap04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap04.spring.ChangePasswordService;
import chap04.spring.MemberDao;
import chap04.spring.MemberInfoPrinter;
import chap04.spring.MemberPrinter;
import chap04.spring.MemberRegisterService;

//assembler대신 스프링을 이용한 객체 조립과 사용
@Configuration
public class AppCtx {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService();
	}

	@Bean
	public ChangePasswordService changePwdSvc() {
		return new ChangePasswordService();
		// ChangePasswordService에서 의존 자동주입을 설정했으므로 설정파일에서 주입하지않아도 된다.
	}

	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}

	@Bean
	public MemberInfoPrinter infoPrinter() {
		return new MemberInfoPrinter();
	}
}
//설정 클래스를 만들었다면 사용해야한다. 
//ApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

//여기서 우리는 빈 객체의 이름이 memberRegSvc인 빈 객체를 getBean()를 통해 얻으면 MemberDao객체가 주입된 상태로 객체를 얻는다.