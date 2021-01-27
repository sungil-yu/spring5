package chap08.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap08.controller.*;

@Configuration
public class ControllerConfig {

	
	@Bean
	public HelloController helloController() {
		
		return new HelloController();
	}
	
}
