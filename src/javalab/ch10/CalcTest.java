package javalab.ch10;

public class CalcTest {

	public static void main(String[] args) {
		//Calc calc = new CompleteCalc();
		Calc calc = new TestCalc();
		
		System.out.println(calc.add(1, 2));
		System.out.println(calc.times(1, 2));
	}

}
