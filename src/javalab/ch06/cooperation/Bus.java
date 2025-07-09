package javalab.ch06.cooperation;

public class Bus {
	private int busNumber;
	private int passengerCount;
	private int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		this.passengerCount = 0;
		this.money = 0;
	}

	public int getBusNumber() {
		return busNumber;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public int getMoney() {
		return money;
	}

	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", passengerCount=" + passengerCount + ", money=" + money + "]";
	}
	
	public void getIn() {
		++this.passengerCount;
		this.money += 1000;
		
		System.out.println("버스승차");
		System.out.println(this.toString());
	}
	
	public void getOut() {
		--this.passengerCount;
		
		System.out.println("버스하차");
		System.out.println(this.toString());
	}
	
	// method overloading
	public void getIn(Student stud) {
		++this.passengerCount;
		this.money += 800;
		
		stud.withdraw(800);
		
		System.out.println("버스승차");
		System.out.println(this.toString());
		System.out.println(stud.toString());
	}
	
	public void getOut(Student stud) {
		this.getOut();
		System.out.println(stud.toString());
	}
	
}
