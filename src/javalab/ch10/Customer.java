package javalab.ch10;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	// 인터페이스의 서로 같은 default 메서드가 있는 경우 오류가 발생되며, Override 하여 해결한다.
	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}

}
