package javalab.ch08;
/*
1. 자식은 인스턴스를 생성할 때 부모 기본 생성자를 찾는다.
2. 부모에 기본 생성자가 없을 경우 에러가 발생된다.
3. 만약 부모에 기본생성자가 없을 경우 자식에세 사용할 부모생성자를 지정해야 한다.
 */


public class VIPCustomer extends Customer {
	private double saleRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // 부모 생성자인 Customer 호출
		this.saleRatio = 0.1;
		this.agentID = agentID;
		bonusRatio = 0.05;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public int getAgentID() {
		return agentID;
	}
	
	@Override // 어노테이션 : 오버라이드(부모의 메서드를 재정의)
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * this.saleRatio);
	}

	@Override
	public String toString() {
		return "VipCustomer [saleRatio=" + saleRatio + ", agentID=" + agentID + ", bonusPoint=" + bonusPoint
				+ ", bonusRatio=" + bonusRatio + "]" + super.toString();
	}
	
	

	
}
