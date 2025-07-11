package javalab.ch09;

public class RunningTest {

	public static void main(String[] args) {
		RunningRace race1 = new Run100();
		race1.race();
		
		RunningRace race2 = new RunHurdle();
		race2.race();
	}

}
