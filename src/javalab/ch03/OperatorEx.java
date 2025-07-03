package javalab.ch03;

public class OperatorEx {

	public static void main(String[] args) {
		// 증가/감소 연산자
		// 값을 1씩 증가, 감소시키는 연산자
		int num = 0;
		
		System.out.println(++num); // num = num + 1, 1을 더한 뒤 값을 전달
		System.out.println(num++); // num = num + 1, 전달한 뒤에 1을 증가
		System.out.println(num);
		
		System.out.println(--num); // num = num - 1, 1을 감소한 뒤 값을 전달
		System.out.println(num--); // num = num - 1, 전달한 뒤에 1을 감소
		System.out.println(num);
		
		// 단락(단축)회로
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		// 복합 대입 연산자
		num1 += 2; // num1 = num1 + 2;
		System.out.println(num1);
		
		// 조건(삼항) 연산자
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		// 실습 - (정수)나눗셈, 분모 a 변수에 0을 입력할 경우 나눗셈을 하지 않는다.
		int a = 0, b = 3;
		int result = 0;
		
		if (a != 0) {
			result = b / a;
		}
		System.out.println(result);
		
		boolean isExecute = (a != 0) && ((result = b / a) >= 0);
		System.out.println(isExecute);
		System.out.println(result);
		
		result = (a != 0) ? b / a : 0;
		System.out.println(result);
		
	}

}
