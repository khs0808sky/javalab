package javalab.ch02;

// 자료형 추론
/*
	1. 리터럴을 이용하여 추론한다.
	2. 추론된 자료형은 변경되지 않는다. (1번만 추론된다.)
	3. 지역 변수로만 사용 가능하다. (주로 메서드 블럭)
 */
public class TypeInference {

	public static void main(String[] args) {

		int i = 10;
		var j = 10.1; // 자료형 추론 (double)
		var str = "hello";
		
		System.out.println(i); // sysout + [ctrl + space] 자동생성 단축키
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 1;
		
		// 전역변수
		int a = 1;
		//int a = 2;
		int b = 2;
		{
			// block(Scope)
			// 전역변수
			a = 2;
			b = 3;
			
			// 지역변수 : block을 탈출하는 순간에 메모리(스택:기본형)에서 제거된다.
			// 			block(Scope) 내에서만 상태가 유지되는 변수
			int c = 4;
		}
		//System.out.println(c); // c는 지역변수이기 때문에 메모리에서 제거되어 사용 불가능
		
		System.out.println(a);
		System.out.println(b);
		
		// 상수 : 값의 수정이 불가능하다. 불변, 대문자로 변수명 지정
		final double PI = 3.14;
		
	}

}
