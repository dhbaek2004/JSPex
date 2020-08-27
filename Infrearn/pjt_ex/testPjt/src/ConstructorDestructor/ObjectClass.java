package ConstructorDestructor;

public class ObjectClass {
	
	public int x;
	public int y;
	
	public ObjectClass(String s, int[] iArr) {
		System.out.println("--ObjectClass()--");
		
		System.out.println("s ----> " + s);
		System.out.println("iArr ----> " + iArr);
	}
	
	public ObjectClass(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void getInfo() {
		System.out.println("x ----> " + this.x);
		System.out.println("y ----> " + this.y);
	}
	
}
