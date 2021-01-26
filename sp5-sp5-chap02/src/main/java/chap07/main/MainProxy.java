package chap07.main;

import chap07.ExeTimeCalculator;
import chap07.ImpeCalculator;

public class MainProxy {

	public static void main(String[] args) {

		ExeTimeCalculator cal1 = new ExeTimeCalculator(new ImpeCalculator());
		System.out.println(cal1.factorial(20));
		
		ExeTimeCalculator cal2 = new ExeTimeCalculator(new ImpeCalculator());
		System.out.println(cal2.factorial(20));
		
	}

}

//이로써 ImpeCalculator와 RecCalculator의 코드 변경없이 실행 시간을 구할 수 있었다.
