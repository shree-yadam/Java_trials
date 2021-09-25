class Person {
	
	//Instance variables
	String name;
	int age;
	
	//Methods
	void speak() {
		System.out.printf("My name is %s and age is %d\n", name, age);
	}
	
}

public class App {
	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name = "Joe Smith";
		person1.age = 40;
		
		person1.speak();
		Person person2 = new Person();
		
		person2.name = "Sam Barbados";
		person2.age = 20;
		
		person2.speak();

	}
}
