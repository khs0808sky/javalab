package javalab.ch06;

class Student {
	private int id;
	private String name;
	private int grade;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	
	public Student setId(int id) {
		this.id = id;
		return this;
	}
	public Student setName(String name) {
		this.name = name;
		return this;
	}
	public Student setGrade(int grade) {
		this.grade = grade;
		return this;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
	
	
}

public class ReturnThisEx {

	public static void main(String[] args) {
		Student stud = new Student();
		 stud.setId(12345)
		 	 .setName("학생1")
		 	 .setGrade(1); // 메서드 체이닝
		 System.out.println(stud.toString());
	}

}
