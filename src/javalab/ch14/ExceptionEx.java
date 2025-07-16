package javalab.ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionEx {

	public static void main(String[] args) {
		int a = 2;
		int b = 0;
		int c = 0;
		
		try {
			c = a / b;
			System.out.println(c);
		} 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("연산 중 오류가 발생되었습니다.");
		}
		System.out.println("1. 연산이 완료되었습니다.");
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			// 파일에 있는 데이터로 나눗셈을 할 경우
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("연산 중 오류가 발생되었습니다.");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			if (fis != null) {
				try {
					fis.close();
				} 
				catch (IOException e) {
					System.out.println(e);
				}
			}
			
		}
		
		// try-with-resources
		// AutoCloseable 인터페이스의 close() 메서드가 구현되어야 한다.		
		try (
			FileInputStream fis1 = new FileInputStream("a.txt");
		){
			// fis1을 이용한 처리
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
