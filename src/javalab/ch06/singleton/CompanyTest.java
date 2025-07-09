package javalab.ch06.singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company comp1 = Company.getInstance();
		Company comp2 = Company.getInstance();
		
		System.out.println(comp1);
		System.out.println(comp2);
	}

}
