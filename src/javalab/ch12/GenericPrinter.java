package javalab.ch12;

// extends : 타입 매개변수를 class, interface로 제한을 둘 때 사용한다.
public class GenericPrinter<T extends Material> {
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public void doPrinting() {
		// this.material.print(); // 형식매개변수 T가 정해지지 않았으므로 오류가 발생된다.
		this.material.print(); // extends Material
	}

	@Override
	public String toString() {
		return this.material.toString();
	}
	
	
}
