package javalab.ch06.cooperation;

public class Student {
	private String studentName;
	private int grade;
	private int money;
	
	public Student(String studentName, int grade, int money) {
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;	
	}
	
	public void depoist(int amount) {
		this.money += amount;
	}
	
	public void withdraw(int amount) {
		this.money -= amount;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", grade=" + grade + ", money=" + money + "]";
	}
	
	
}
