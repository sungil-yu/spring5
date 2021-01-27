package chap08.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc  //스프링 MVC설정의 기본적인 구성을 활성화한다. //WebMvcConfigurer인터페이스는 스프링의 개별 설정을 조정할 때 사용
public class MvcConfig implements WebMvcConfigurer{

	
	//매핑 경로를 /로 주었을 때 jsp, html, css를 올바르게 처리하기위한 설정 추가
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

			configurer.enable();
	}
	
	
	//jsp를 이용해서 컨트롤러의 실행 결과를 보여주기 위한 설정
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {

		registry.jsp("/WEB-INF/view/", ".jsp");
	}
}
