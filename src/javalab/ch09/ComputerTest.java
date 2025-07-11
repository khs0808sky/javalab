package javalab.ch09;

public class ComputerTest {

	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		DeskTop desktop = new DeskTop();
		
		notebook.display();
		notebook.typing();
		
		desktop.display();
		desktop.typing();
		
		display(notebook);
		display(desktop);
	}

	public static void display(Computer computer) {
		computer.display();
		computer.typing();
	}
}
