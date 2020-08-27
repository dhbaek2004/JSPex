package objectMemory;

public class MainClass {

	public static void main(String[] args) {
		
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
		ObjectClass obj3 = new ObjectClass();
		
		System.out.println("obj1 : " +obj1);
		System.out.println("obj2 : " +obj2);
		System.out.println("obj3 : " +obj3);
		//객체가 전부 다른 메모리공간에 위치해 있다는걸 알 수 있다.
		
		obj1.getInfo();
		
		obj1 = null;
		obj1.getInfo();
		//객체에 null을 넣으면 GC에 의해 회수되므로 접근이 불가능해짐
	}

}
