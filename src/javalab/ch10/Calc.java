package javalab.ch10;

public interface Calc {
	double PI = 3.14; // 상수. final이 자동으로 적용
	int ERROR = -99999;
	
	int add(int num1, int num2); // 추상메서드. public abstract
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
