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
	//�������̽��� ��ӹ��� �ڿ��� ������ �ش� �������̽��� �޼ҵ带 ���� �� ����Ѵ�.
}
