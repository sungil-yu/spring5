package chap07.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import chap07.RecCalculator;
import chap07.aspect.CacheAspect;
import chap07.aspect.ExeTimeAspect;
import chap07.interfaceModule.Calculator;

@Configuration
@EnableAspectJAutoProxy
public class AppCtx {

	
	@Bean
	public CacheAspect cacheAspect() {
		return new CacheAspect();
	}
	
	
	@Bean
	public ExeTimeAspect exeTimeAspect() {
		return new ExeTimeAspect();
	}
	
	
	@Bean
	public Calculator calculator() 
	{
		return new RecCalculator();
	}
	
	
}
