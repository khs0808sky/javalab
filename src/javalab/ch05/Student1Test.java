package javalab.ch05;

public class Student1Test {

	public static void main(String[] args) {
		Student1 stud1 = new Student1();
		
		// 기본형
		stud1.koreanName = "국어";
		stud1.koreanScore = 90;
		stud1.mathName = "수학";
		stud1.mathScore = 90;
		
		stud1.koreanScore = 100; // side effect(부작용)
		
		System.out.println(stud1.toString());
		
		// 참조형(class)
		Subject korean = new Subject();
		korean.subjectName = "국어";
		korean.scorePoint = 90;
		
		Subject math = new Subject();
		math.subjectName = "수학";
		math.scorePoint = 90;
		
		stud1.korean = korean;
		stud1.math = math;
		
		Subject korean1 = new Subject("국어", 90); // 생성자
		stud1.korean = korean1; // 객체 주소를 전달한다.
		
		stud1.math = new Subject("수학", 90); // 객체 주소를 전달한다.
	}

}
