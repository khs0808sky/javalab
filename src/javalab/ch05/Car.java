package javalab.ch05;

/*
 class diagram
 --------
 자동차
 --------
 속도 | 상태(속성, 멤버변수)
 --------
 가속 | 상태변화 기능(메서드, 함수)
 감속 |
 -------- 
 */

public class Car {
	int speed = 0;
	
	public void upSpeed(int amount) {
		speed += amount;
		System.out.println(speed);
	}
	
	public void downSpeed(int amount) {
		speed -= amount;
		System.out.println(speed);
	}
}
