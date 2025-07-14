package javalab.ch12;

public class Plastic implements Material {

	@Override
	public void print() {
		System.out.println("Plastic재료로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 Plastic입니다.";
	}	

}
