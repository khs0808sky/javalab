package javalab.ch07;

public class ArrayTest {

	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		for (int idx = 0, len = nums.length; idx < len; idx++) {
			System.out.println(idx + ". " + nums[idx]);
		}
		
		nums[0] = 2; nums[1] = 1;
		
		// 문자배열
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for (int i = 0; i < alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		
		for (int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
		
		// 객체배열
		Book[] books = new Book[5];
		
		books[0] = new Book("태백산맥", "조정래");
		books[1] = new Book("데미안", "헤르만 헤세");
        books[2] = new Book("어떻게 살 것인가", "유시민");
        books[3] = new Book("토지", "박경리");
        books[4] = new Book("어린왕자", "생텍쥐페리");
        
        for (int i = 0, len = books.length; i < len; i++) {
        	books[i].showBookInfo();
        }
        
	}

}
