package javalab.ch02;

public class BInaryTest2 {

	public static void main(String[] args) {
		// 음수 양수 더하기
		int num1 = 0B00000000000000000000000000000101;	// 이진수 5
		int num2 = 0B11111111111111111111111111111011;	// 이진수 -5
		
		int sum = num1 + num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
	}
}
