package javalab.ch05;

public class PersonTest {

	public static void main(String[] args) {
		// 2. 기본 생성자
		Person personKim = new Person(); // 기본생성자
		personKim.name = "김유신";
		personKim.weight = 85.5f;
		personKim.height = 180;
		
		
		// 1. 사용자 생성자 - 객체를 만드는데 필요한 필수 데이터(값)을 지정
		Person personLee = new Person("이순신", 175, 75);
	}

}
