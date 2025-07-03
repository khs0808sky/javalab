package javalab.ch02;

// 형식 변환
public class TypeConversion {

	public static void main(String[] args) {
		int iNum = 1000;
		byte bNum = (byte)iNum; // 명시적 형변환 - 범위 : int > byte, 
								// 			   int 값의 크기가 byte범위 인지 확인
								// 			   overflow 현상 발생
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		int iNum2 = (int)dNum; // 명시적 형변환 - 범위 : double > int
		
		System.out.println(dNum);
		System.out.println(iNum2);
	
		// 1.2와 0.9F를 더한 값을 정수형으로 출력하세요.
		// 단 변수명은 dNum1, fNum을 이용하고 결과값은 int형 iNum3으로 구하여 출력하세요.
		
		double dNum1 = 1.2;
		float fNum = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum;
		int iNum4 = (int)(dNum1 + fNum); // <- 총합
		
		System.out.println(iNum3);		
		System.out.println(iNum4);		
		
		// 묵시적
		byte bNum1 = 10;
		int iNum1 = bNum1;
		
		System.out.println(bNum1);
		System.out.println(iNum1);
		
		int iNum5 = 20;
		float fNum1 = iNum5;
		
		System.out.println(iNum5);
		System.out.println(fNum1);
		
		double dNum2; // 기본형 변수는 사용전 초기화(값의 대입)이 필수.
		dNum2 = fNum1 + iNum5;
		System.out.println(dNum2);
	
	}

}
