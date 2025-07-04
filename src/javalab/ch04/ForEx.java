package javalab.ch04;

import java.util.stream.IntStream;

public class ForEx {

	public static void main(String[] args) {
		
		// 1 ~ 10까지 합을 구하세요
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			// for문의 초기화 부분에서 선언된 변수는 for 블럭 지역변수이다.
			// sum은 for 블럭 외부에서 사용되기 때문에 전역변수로 선언되어야 한다.
			sum += i;
			System.out.println("i : " + i + ", sum : " + sum);
		}
		
		System.out.println("1 ~ 10까지의 합은 " + sum + "입니다.");

		// 정수 구구단을 출력해주세요.
		// 변수명: 단(dan), 배수(times)
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("====" + dan + "단====");
			for (int times = 1; times <= 9; times++) {
				System.out.println(dan + " X " + times + " = " + dan * times);
			}
		}
		
		// 1 ~ 100까지의 숫자 중 홀수의 합을 구하세요.
		// 1. 홀수인지 검사하여 처리하세요.
		// 2. 짝수인지 검사하여 처리하세요.
		
		// 1.
		int total = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				total += i;
			}
		}
		System.out.println("1 ~ 100까지의 홀수 합 : " + total);
		
	
		// 2.
		total = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				continue; // 이하의 모든 코드를 실행하지 않고 반복을 계속 진행한다.
			}
			total += i;
		}
		System.out.println("1 ~ 100까지의 홀수 합 : " + total);
		
		// 0부터 시작하여 1씩 증가하여 더한 숫자의 합이 100이 이상인 경우 그 수와 합을 출력하세요.
		// 1. for
		// 2. while
		
		int sum1 = 0;
		int num;
		for (num = 0; ; num++) {
			sum1 += num;
			if (sum1 >= 100) 
				break; // 반복을 중단
		}
		System.out.println("num : " + num + ", sum : " + sum1);
		
		sum1 = 0;
		num = 0;
		while (sum1 <= 100) {
			num++;
			sum1 += num;
		}
		System.out.println("num : " + num + ", sum : " + sum1);
		
		
		System.out.println(IntStream.range(1, 11).sum());
	}

}
