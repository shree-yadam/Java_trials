
public class App {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		
		mach1.start();
		mach1.stop();

		
		Car car1 = new Car();
		car1.start();
		car1.wipeWindshield();
		car1.stop();
		

		Machine machine;
		machine = mach1;
		
		machine.start();
		
		
		machine = car1;
		machine.start();
		
		car1.showInfo();
	}

}
