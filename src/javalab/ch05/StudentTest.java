package javalab.ch05;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student(); // new 생성자()
		student1.studentName = "홍길동"; // 멤버변수
		System.out.println(student1.getStudentName()); // 메서드
		
		Student student2 = new Student();
		student2.studentName = "이순신";
		System.out.println(student2.getStudentName());
		
		// Student 클래스 인스턴스인 student3를 생성하고 멤버필드 studentName을 "고길동"으로 초기화한 뒤 출력하세요.
		Student student3 = new Student();
		student3.studentName = "고길동";
		System.out.println(student3.getStudentName());
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}

}
