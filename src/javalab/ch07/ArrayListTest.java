package javalab.ch07;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>(); 
		// 객체가 ArrayList 클래스인지 체크하고 요소가 Book클래스 형식을 만족하는지 체크 : 일반화(제너릭)
		
		books.add(new Book("태백산맥", "조정래"));
		books.add(new Book("데미안", "헤르만 헤세"));
		books.add(new Book("어떻게 살 것인가", "유시민"));
	
		for (Book book : books) {
			book.showBookInfo();
		}
		
		for (int i = 0, len = books.size(); i < len; i++) {
			Book book = books.get(i);
			book.showBookInfo();
			// books.get(i).showBookInfo();
		}
	}

}
