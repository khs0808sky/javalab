package javalab.ch13;

@FunctionalInterface
public interface MyNumber {
	int getMax(int num1, int num2);
	// int add(int num1, int num2); // 람다표현식을사용하려면 추상 메서드가 1개여야만 한다.
}


// 자바가 제공하는 기본 FunctionalInterface
/*
Consumer	T -> void	void accept(T t)
Supplier	() -> T		T get()
Function<T,R>	T -> R	R apply(T t)
Runnable	() -> void	void run()
*/