package chap07.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap07.config.AppCtx;
import chap07.interfaceModule.Calculator;

public class MainAspectWithCache {

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppCtx.class);
		
		Calculator cal = ctx.getBean("calculator",Calculator.class);
		cal.factorial(7);
		cal.factorial(7);
		cal.factorial(5);
		cal.factorial(5);
		
		ctx.close();
	}
}
