package javalab.ch10;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cust = new Customer();
		cust.buy();
		cust.sell();
		
		Buy buy = cust;
		buy.buy();
		
		Sell sell = cust;
		sell.sell();
		
		if (sell instanceof Customer) {
			Customer cust2 = (Customer)sell;
			cust2.buy();
		}
	}

}
