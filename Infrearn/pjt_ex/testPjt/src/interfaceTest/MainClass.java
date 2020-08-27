package interfaceTest;

public class MainClass {

	public static void main(String[] args) {
		
//		InterfaceA ia = new InterfaceClass();
//		InterfaceB ib = new InterfaceClass();
//		
//		ia.funA();
//		ib.funB();
		
		Toy robot = new ToyRobot();
		Toy airplain = new ToyAirplane();
		
		Toy toys[] = {robot, airplain};
		
		for(int i = 0; i < toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			
			System.out.println();
		}
	}

}
