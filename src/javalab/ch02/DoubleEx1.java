package javalab.ch02;

import java.math.BigDecimal; // 정밀한 소수 계산이 필요할 때

public class DoubleEx1 {

	public static void main(String[] args) {
		
		double dnum = 3.14;
		float fnum = 3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
	
		// 부동소수점 오류
		double dNum = 0.1 + 0.1 + 0.1;
		System.out.println(dNum);
		
		BigDecimal bdNum = new BigDecimal("0.1");
		var bdNum1 = new BigDecimal("0.1");	// 자료형 추론
		
		BigDecimal result = bdNum.add(bdNum).add(bdNum);
		System.out.println(result);

	}

}
