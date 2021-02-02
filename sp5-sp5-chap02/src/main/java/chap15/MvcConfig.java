package chap15;

import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc // <mvc:annotation-driven/>과 같은역할인데 어노테이션으로 등록된빈을 찾아 등록해준다.,검증 빈도 등록해준다.
public class MvcConfig implements WebMvcConfigurer{

	//단순 연결을 위해 컨트롤러를 만들어 요청과 맵핑하는 일은 여간 귀찮은 일이 아니다. 
	//이런 성가심을 없애기위한 매서드이다. 
	//validation-api를 의존 설정해주어야한다.
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
			
		registry.addViewController("/main").setViewName("main");
		//이 설정은 /main으로오는 요청경로를  view이름이 main인 view를 사용한다고 설정한다.
	}
	
	
	@Override
	public Validator getValidator() {
		//여기다 생성한 validtor 클래스를 리턴하도록하면된다.
		
		return WebMvcConfigurer.super.getValidator();
	}
}
