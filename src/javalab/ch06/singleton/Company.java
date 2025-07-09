package javalab.ch06.singleton;

// 1. singleton dp
// - 생성자 private : 생성자를 외부에서 사용 못하게 함.
// - 객체 생성메서드 제공 : getInstance()
// - 단일 객체를 생성하여 다른 객체가 사용할 수 있도록 공유함.
public class Company {
	
	// 클래스 메서드에서 사용할 수 있도록 클래스 멤버변수
	private static Company instance = new Company();
	
	private Company() {}
	
	// 외부에서 생성자를 사용할 수 없으므로, 클래스 메서드(인스턴스 생성없이 사용가능)로 선언
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		
		return instance;			
	}
}
