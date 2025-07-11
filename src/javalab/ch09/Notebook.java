package javalab.ch09;

public class Notebook extends Computer {

	@Override
	public void display() {
		System.out.println("노트북 모니터");
	}

	@Override
	public void typing() {
		System.out.println("노트북 키보드");
	}
	
}
