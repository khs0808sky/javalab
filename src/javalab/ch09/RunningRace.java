package javalab.ch09;

public abstract class RunningRace {
	private void ready() {
		System.out.println("준비");
	}
	
	protected abstract void run();
	
	private void finish() {
		System.out.println("결승선");
	}
	
	// 탬플릿 메서드 DP
	// final 메서드 : 오버라이딩 금지 - 실행순서 변경 금지
	final public void race() {
		ready();
		run();
		finish();
	}
}
