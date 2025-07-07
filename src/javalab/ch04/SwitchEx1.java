package javalab.ch04;

public class SwitchEx1 {

	public static void main(String[] args) {
		// 경기 순위가 1등이면 "G", 2등이면 "S", 3등이면 "B", 그외 순위는 "A"로 출력하세요.
		// 변수명 : 순위(ranking), 메달색(medalColor)
		// if문

		
		int ranking = 1;
		String medalColor;
		
		if (ranking == 1) {
			medalColor = "G";
		}
		else if (ranking == 2) {
			medalColor = "S";
		}
		else if (ranking == 3) {
			medalColor = "B";
		}
		else {
			medalColor = "A";
		}
		
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");
		
		ranking = 1;
		// 자바 7부터 문자열입력 가능
		
		switch (ranking) {
			case 1: medalColor = "G";
				break;
			case 2: medalColor = "S";
				break;
			case 3: medalColor = "B";
				break;
			default: medalColor = "A";
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");
		
		String[] medals = {"", "G", "S", "B", "A"};
		System.out.println(medals[1]); // 배열인덱스를 이용한 방법
		System.out.println(medals[ranking]);
		System.out.println(medals[(ranking > 3) ? 4 : ranking]);
		
		// break문 생략
		String medal = "Gold";
		switch (medal) {
			case "Gold" -> System.out.println("금메달 입니다.");
			case "Silver" -> System.out.println("은메달 입니다.");
			case "Bronze" -> System.out.println("동메달 입니다.");
			default -> System.out.println("메달이 없습니다.");
		}
		
		// 표현식
		String message = switch (medal) {
			case "Gold" -> "금메달 입니다.";
			case "Silver" -> "은메달 입니다.";
			case "Bronze" -> "동메달 입니다.";
			default -> "메달이 없습니다.";
		};
		System.out.println(message);
		
		int month = 7;
		int day = switch(month) {
			case 2 -> 28;
			case 4, 6, 9, 11 -> 30;
			case 1, 3, 5, 7, 8, 10, 12 -> 31;
			default -> {
				if (month < 1 || month > 12) {
					System.out.println("잘못된 월입니다.");
				}
				else {
					System.out.println("알 수 없는 오류입니다.");
				}
				yield 0; // 0값을 반환
			}
		};
		
		System.out.println(month + "월의 날짜는 " + day + "일까지 있습니다");
	}
	
}
