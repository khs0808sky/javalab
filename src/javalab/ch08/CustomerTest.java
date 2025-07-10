package javalab.ch08;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.calcPrice(1000);
		System.out.println(cust1.toString());
		
		Customer cust2 = new Customer(10000, "고객");
		cust2.calcPrice(10000);
		System.out.println(cust2.toString());
		
		VIPCustomer vip1 = new VIPCustomer(20000, "VIP고객", 12345);
		System.out.println(vip1.calcPrice(100000));
		System.out.println(vip1.toString());
		
		// Down Casting (자식 -> 부모) ※Up Casting 같음
		// VIPCustomer 클래스가 Customer 클래스의 구조를 만족하는지 확인
		// - Customer의 기능만 사용가능
		Customer vip3 = new VIPCustomer(20002, "VIP고객3", 12345);
		System.out.println(vip3.calcPrice(100000));
		System.out.println(vip3.toString());
		// vip3.getAgentID() 사용불가
		
		// Up Casting ※Down Casting 같음
		VIPCustomer vip4 = (VIPCustomer)vip3;
		System.out.println(vip4.getAgentID());
	}

}
