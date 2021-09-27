import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

class Machine {

	private String name;
	private int code;
	
	public Machine() {
		this("Bertie", 0);
		System.out.println("Constructor running!");
		
	}
	
	public Machine(String name) {
		this(name, 0);
		System.out.println("2nd Constructor running!");		
	}
	
	public Machine(String name, int code) {
		System.out.println("3rd Constructor running!");
		
		this.name = name;
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCode() {
		return this.code;
	}
}

public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		System.out.println(machine1.getName());
		System.out.println(new Machine("Arnie").getName());
		
		Machine machine2 = new Machine("Charlie", 23);
		System.out.println(machine2.getName());
		System.out.println(machine2.getCode());
	}

}
