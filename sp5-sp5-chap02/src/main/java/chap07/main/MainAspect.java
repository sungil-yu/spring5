package chap07.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap07.RecCalculator;
import chap07.config.AppCtx;
import chap07.interfaceModule.Calculator;

public class MainAspect {
		
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppCtx.class);
		Calculator cal = ctx.getBean("calculator",Calculator.class);
		long fiveFact = cal.factorial(5);
		System.out.println("cal.factorial(5) = " + fiveFact);
		System.out.println(cal.getClass().getName());
		ctx.close();
	}
}
