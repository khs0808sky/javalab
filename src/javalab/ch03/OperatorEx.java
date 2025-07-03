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
	}

}
