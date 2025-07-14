package javalab.ch12;

public class Powder implements Material {

	@Override
	public void print() {
		System.out.println("Powder재료로 출력합니다.");
	}

	@Override
	public String toString() {
		return "재료는 Powder입니다.";
	}	
}
