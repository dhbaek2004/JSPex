package inherit;

public class FirstChildClass extends ParentClass {
	
	public FirstChildClass() {
		System.out.println("--FirstChildClass Constructor--");
	}
	
	@Override
	public void makeJajang() {
		System.out.println(" -- First delicious makeJajang --");
	}
}
