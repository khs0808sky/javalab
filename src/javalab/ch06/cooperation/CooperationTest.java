package javalab.ch06.cooperation;

public class CooperationTest {

	// main : entry point method
	// static : Class를 통해 접근하는 변수, 메서드를 지정할 때 사용하는 키워드
	public static void main(String[] args) {
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		
		Subway line1 = new Subway(1);
		
		bus100.getIn(); // 버스 승차
		bus100.getOut(); // 버스 하차
		line1.getIn(); // 지하철 승차
		line1.getOut(); // 지하철 하차
		bus200.getIn();
		bus200.getOut();
		
		Student stud1 = new Student("학생1", 1, 10000);
		System.out.println(stud1.toString());
		
		Student stud2 = new Student("학생2", 1, 20000);
		System.out.println(stud2.toString());
		
		bus100.getIn(stud1);
		bus100.getIn(stud2);
		
		bus100.getOut(stud1);
		line1.getIn(stud1);
		line1.getOut(stud1);
	}

}
