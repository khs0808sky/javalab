package javalab.ch06.cooperation;

public class Subway {
	private int lineNumber;
	private int passengerCount;
	private int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
		this.passengerCount = 0;
		this.money = 0;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public int getMoney() {
		return money;
	}

	@Override
	public String toString() {
		return "Subway [lineNumber=" + lineNumber + ", passengerCount=" + passengerCount + ", money=" + money + "]";
	}
	
	public void getIn() {
		++this.passengerCount;
		this.money += 1500;
		
		System.out.println("지하철승차");
		System.out.println(this.toString());
	}
	
	public void getOut() {
		--this.passengerCount;
		
		System.out.println("지하철하차");
		System.out.println(this.toString());
	}
	
	public void getIn(Student stud) {
		++this.passengerCount;
		this.money += 1300;
		
		stud.withdraw(1300);
		
		System.out.println("지하철승차");
		System.out.println(this.toString());
		System.out.println(stud.toString());
	}
	
	public void getOut(Student stud) {
		this.getOut();
		System.out.println(stud.toString());
	}
}
