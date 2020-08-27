package method;

public class MainClass {

	public static void main(String[] args) {
		
		ChildClass child1 = new ChildClass();
		
		child1.setInfo("hong gil dong", "Male", 20);
//		child1.name = "hong gil dong";
//		child1.gender = "Male";
//		child1.age = 20;
		
		child1.getInfo();
		
//		child1.mySecret(); //private 접근자로 선언된 클래스는 외부 호출이 불가능하다.
		
	}

}
