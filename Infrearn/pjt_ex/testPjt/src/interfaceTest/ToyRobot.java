package interfaceTest;

public class ToyRobot implements Toy {

	@Override
	public void walk() {
		System.out.println("Robot is walking");
	}

	@Override
	public void run() {
		System.out.println("Robot is running");
	}

	@Override
	public void alarm() {
		System.out.println("Robot's alarm turn on");
	}

	@Override
	public void light() {
		System.out.println("Robot's light turn on");
	}

}
