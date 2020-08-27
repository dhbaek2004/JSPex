package inherit;

public class SecondChildClass extends ParentClass {
	
	public SecondChildClass() {
		System.out.println("--SecondChildClass Constructor--");
	}
	
	
	@Override
	public void makeJajang() {
		System.out.println(" -- Second delicious makeJajang --");
	}
}
