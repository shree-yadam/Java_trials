class Person {
	
	//Instance variables
	String name;
	int age;
	
	//Methods
	void speak() {
		System.out.printf("My name is %s and age is %d\n", name, age);
	}
	
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		
		return yearsLeft;
	}
}

public class App {
	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name = "Joe Smith";
		person1.age = 40;
		
		person1.speak();
		
		int years = person1.calculateYearsToRetirement();
		
		System.out.println("Years till retirement " + years);

	}
}
