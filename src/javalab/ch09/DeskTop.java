package javalab.ch09;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("데스크탑 모니터");
	}

	@Override
	public void typing() {
		System.out.println("데스크탑 키보드");
	}

}
