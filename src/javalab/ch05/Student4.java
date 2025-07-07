package javalab.ch05;

// 조건
// 1. 모든 학생은 학번과 성명을 가지고 있다. 변경 불가능하다.
// 2. 국어와 수학 과목이 있고 각각 과목명과 점수가 있고 변경 불가능하다.
public class Student4 {
	private int studentID;
	private String studentName;

	private Subject korean;
	private Subject math;
	
	// 1. 학번과 성명
	// 생성자 - 멤버변수 초기화, 객체 생성 시 1회만 실행된다.
	public Student4(int pStudentID, String pStudentName) {
		studentID = pStudentID;
		studentName = pStudentName;
	}
	
	// getter, setter design pattern
	// 마우스 오른쪽 버튼 -> Source -> Generate Getters and Setters
	public int getStudentID() {
		return studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String pStudentName) {
		studentName = pStudentName;
	}
	
	public Subject getKorean() {
		return korean;
	}

	public void setKorean(Subject korean) {
		this.korean = korean;
	}

	public Subject getMath() {
		return math;
	}

	public void setMath(Subject math) {
		this.math = math;
	}

	public void showInfo() {
		System.out.println("학번 : " + studentID + ", 성명 : " + studentName);
		System.out.println("국어 : " + korean.subjectName +  korean.scorePoint +
				", 수학 : " + math.subjectName + math.scorePoint);
	}
	
	
}
