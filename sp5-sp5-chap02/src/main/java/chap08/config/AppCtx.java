package chap08.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import chap04.spring.ChangePasswordService;
import chap04.spring.MemberDao;
import chap04.spring.MemberInfoPrinter;
import chap04.spring.MemberPrinter;
import chap04.spring.MemberRegisterService;
import chap04.spring.MemberSummaryPrinter;
import chap05.spring.VersionPrinter;

//assembler대신 스프링을 이용한 객체 조립과 사용
//Component 스캔을 이용하기 위해선 설정파일에 ComponentScan애노테이션을 설정해주어야 한다.
@ComponentScan(basePackages = {"spring"})
@Configuration
public class AppCtx {

	
	@Bean
	@Qualifier("printer") //printer라는 이름을 주어 한정시키고
	public MemberPrinter memberPrinter1() {
		return new MemberPrinter();
	}
	
	@Bean
	@Qualifier("summaryPrinter")
	public MemberSummaryPrinter memberPrinter2() {
		return new MemberSummaryPrinter();
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
}
//설정 클래스를 만들었다면 사용해야한다. 
//ApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

//여기서 우리는 빈 객체의 이름이 memberRegSvc인 빈 객체를 getBean()를 통해 얻으면 MemberDao객체가 주입된 상태로 객체를 얻는다.