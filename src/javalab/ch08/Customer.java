package javalab.ch08;

public class Customer {
	private int customerID;
	private String customerName;
	private String customerGrade;
	
	protected int bonusPoint; // 상속 받은 클래스에서 접근 가능. 다른 패키지에서도 접근 가능
	protected double bonusRatio;
	
	public Customer() {
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01;
		this.bonusPoint = 0;
		
		System.out.println("Customer() 생성자 호출");
	}

	public Customer(int customerID, String customerName) {
		this(); // this 생성자는 제일 처음에 사용.
		this.customerID = customerID;
		this.customerName = customerName;
		
		System.out.println("Customer(int customerID, String customerName) 생성자 호출");
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}
	
	// bonusPoint의 상태를 변화시키는 메서드
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}
	
}
