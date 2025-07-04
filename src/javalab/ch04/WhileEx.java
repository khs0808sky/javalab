package javalab.ch04;

// Class 명을 변경할 경우 STS로 생성하였으므로 STS의 Refactor기능을 이용한다.
public class WhileEx {

	public static void main(String[] args) {
		// 1 ~ 10의 정수의 총합을 구하여 출력하세요.
		int num = 1;
		int sum = 0;
		
		// 조건을 먼저 검사 - 블록내 코드가 실행된다는 것을 보장할 수 없다.
		while (num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		// 조건을 나중에 검사 - 블록내 코드가 적어도 1번 실행된다는 것을 보장한다.
		num = 1;
		sum = 0;
		do {
			sum += num;
			num++;
		} while (num <= 10);
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
