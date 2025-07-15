package javalab.ch13;

public class MyNumberTest {

	public static void main(String[] args) {
		// 인터페이스에 추상메서드 구현. 익명 내부 클래스 생성
		MyNumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMax(10, 20));
		
		showResult(max);
		
		MyNumber add = addNumber();
		System.out.println(add.getMax(10, 20));
	}

	public static void showResult(MyNumber pObj) {
		System.out.println(pObj.getMax(1, 2));
	}
	
	public static MyNumber addNumber() {
		return (x, y) -> x + y;
	}
	
}
