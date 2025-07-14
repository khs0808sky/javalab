package javalab.ch11;

public class StringEx {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		
		str2 += "d";
		
		System.out.println(str1 == str2);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str3 == str4); // 두 객체의 주소가 다르다. (주소 비교)
		System.out.println(str3.hashCode()); // String pool의 주소가 같다.
		System.out.println(str4.hashCode());
		
		System.out.println(str3.equals(str4)); // 값의 비교
		
		System.out.println(System.identityHashCode(str3)); // String pool의 주소가 같다.
		System.out.println(System.identityHashCode(str4));
		
		//================================================
		// StringBuilder, StringBuffer
		
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr); // String으로부터 StringBuilder 생성
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString(); // String 클래스로 변환
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		// Text Block
		// 자바의 문자열은 한 줄만 가능하다.
		// 이스케이프 문자(escape 문자)
		String str5 = "안녕하세요. \n\t반갑습니다. \t다음에 또 만나요.";
		System.out.println(str5);
		
		String str6 = """
				안녕하세요.
					반갑습니다.		다음에 또 만나요.
				""";
		System.out.println(str6);
		
		// formatted
		String str7 = """
				안녕하세요. %s님
				반갑습니다.	 %d 번째 만남입니다.
				당신의 포인트는 %.1f입니다.
				다음에 또 만나요.
				""".formatted("홍길동", 10, 123.45);
		System.out.println(str7);
	}

}
