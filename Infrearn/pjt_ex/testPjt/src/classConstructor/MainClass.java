package classConstructor;

public class MainClass {

	public static void main(String[] args) {
		
		Grandeur myCar1 = new Grandeur();
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 100;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		Grandeur myCar2 = new Grandeur();
		myCar1.color = "yellow";
		myCar1.gear = "auto";
		myCar1.price = 500;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
//		Bicycle myBicycle = new Bicycle();
//		myBicycle.color = "red";
//		myBicycle.price = 100;
		Bicycle myBicycle = new Bicycle("red", 100);
		
		myBicycle.info();
		
	}

}
