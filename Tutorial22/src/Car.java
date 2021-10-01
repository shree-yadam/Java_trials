
public class Car extends Machine{
	public void wipeWindshield() {
		System.out.println("Wiping windshield.");
	}
	
	public void start() {
		System.out.println("Car started.");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");
	}
	
	public void showInfo() {
		System.out.println("Car name: " + name);
	}
}
