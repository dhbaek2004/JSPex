package inherit;

public class ParentClass {
	
	public ParentClass() {
		System.out.println("--ParentClass Constructor--");
	}
	
	public void parentFun() {
		System.out.println("parentFun()");
	}
	
	private void parentPrivateFun() {
		System.out.println("parentPrivateFun()");
	}
	
	public void makeJajang() {
		System.out.println("-- makeJajang() --");
	}
}
