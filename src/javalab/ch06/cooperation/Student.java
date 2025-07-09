package javalab.ch06.cooperation;

public class Student {
	private String studentName;
	private int grade;
	private int money;
	
	private int studentNo; // 인스턴스(객체) 변수
	private static int gsId; // 클래스(정적) 변수 - 각각의 인스턴스(객체)가 공유할 필요가 있을 경우 사용
	
	public Student(String studentName, int grade, int money) {
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
		
		this.studentNo = ++gsId;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	
	public void depoist(int amount) {
		this.money += amount;
	}
	
	public void withdraw(int amount) {
		this.money -= amount;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", grade=" + grade + ", money=" + money + ", studentNo="
				+ studentNo + "]";
	}	

	
	
	
}
