package javalab.ch06;

// 하나의 소스코드 안에 클래스를 2개 이상 선언하는 경우 접근제한자 public인 클래스는 1개여야만 된다.
class BirthDay {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; // this : new 키워드로 객체가 생성되었을 때 객체 주소값
	}
	
	public void printThis() {
		System.out.println(this); // 주소출력
	}
}

class Person {
	String name;
	int age;
	
	public Person() {
		this("이름없음", 1); // 자기 자신의 다른 생성자 호출. 생성자 overloading 이용.
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printThis() {
		System.out.println(this); // 주소출력
	}
}

public class ThisEx {

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
		
		BirthDay bDay1 = new BirthDay();
		System.out.println(bDay1);
		bDay1.printThis();
		
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		noName.printThis();
	}

}
