package interfaceTest;

public class ToyAirplane implements Toy{

	@Override
	public void walk() {
		System.out.println("Airplane can't walk");
	}

	@Override
	public void run() {
		System.out.println("Airplane can't run");

	}

	@Override
	public void alarm() {
		System.out.println("Airplane has alarm");

	}

	@Override
	public void light() {
		System.out.println("Airplane has light");

	}
	
}
