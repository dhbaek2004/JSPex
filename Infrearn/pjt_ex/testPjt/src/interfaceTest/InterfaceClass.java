package interfaceTest;

public class InterfaceClass implements InterfaceA, InterfaceB {
	
	public InterfaceClass() {
		System.out.println("-- InterfaceClass Constructor --");
	}
	
	@Override
	public void funA() {
		System.out.println(" --funA() --");
	}

	@Override
	public void funB() {
		System.out.println(" --funB() --");
	}
	//인터페이스를 상속받은 뒤에는 무조건 해당 인터페이스의 메소드를 구현 해 줘야한다.
}
