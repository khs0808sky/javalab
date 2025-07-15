package javalab.ch13;

import java.util.Arrays;

public class StreamEx {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0; // how
		for (int i = 0; i < 10; i++) {
			sum += nums[i];
		}
		sum = 100; // side effect(부작용, 부수효과)
		System.out.println(sum);
		
		int sum2 = Arrays.stream(nums).sum(); // what
		long cnt = Arrays.stream(nums).count(); 
		
		System.out.println(sum2);
		System.out.println(cnt);

		int sum3 = Arrays.stream(nums).filter(i -> i % 2 == 0).sum();
		System.out.println(sum3);
		
		Arrays.stream(nums)
		.filter(i -> i % 2 == 0)
		.forEach(i -> System.out.println(i));
		
		Arrays.stream(nums)
			.filter(i -> i % 2 == 0)
			.forEach(System.out::println);
		
		Arrays.stream(nums)
			.filter(i -> i % 2 == 1)
			.map(i -> i * 2)
			.forEach(System.out::println);
	}

}
