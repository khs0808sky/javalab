package javalab.ch14;

public class IDFormatTest {

	public static void main(String[] args) {
		IDFormat user = new IDFormat();
		
		try {
			// user.setUserID(null); // 메서드가 메서드를 던질 수 있어서...
			user.setUserID("12345");
		} 
		catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
