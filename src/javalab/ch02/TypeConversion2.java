package javalab.ch02;

public class TypeConversion2 {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		System.out.println(a + b);
		
		String a1 = "1", b1 = "2"; 
		// 문자열(클래스형) : 참조형(heap) -> 값(heap), 참조(주소, stack)
		// 숫자,문자,논리: 기본형(stack) -> 값(stack), 변수명(stack)
		System.out.println(a1 + b1);
		
		/*
		int a2 = (int)a1; // a1 : 참조(주소값)
		int b2 = (int)b1; // b1 : 참조(주소값)
		*/
		// int -> Integer, double -> Double : Wrapper class
		// heap 공간의 값 -> stack 공간 : unboxing
		int a2 = Integer.parseInt(a1); // a1의 힙공간 주소에 있는 값을 가져온다.
		int b2 = Integer.parseInt(b1); // b1의 힙공간 주소에 있는 값을 가져온다.
		
		System.out.println(a2 +b2);
		
		// stack 공간의 값 -> heap 공간 : boxing
		String s1 = String.valueOf(a2);
		String s2 = String.valueOf(b2);
		
		System.out.println(s1 + s2);
	}

}
