class Person {
	String name;
	int age;
}

public class App {
	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name = "Joe Smith";
		person1.age = 40;
		
		Person person2 = new Person();
		
		person2.name = "Sam Barbados";
		person2.age = 20;
		
		System.out.println(person1.name);

	}
}
