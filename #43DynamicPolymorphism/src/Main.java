import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Animal animal;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What animal would you like?");
		System.out.println("[1] = Dog	[2] = Cat");
		int choice = scanner.nextInt();
		
		if (choice == 1) {
			animal = new Dog();
			animal.speak();
		}
		
		if (choice == 2) {
			animal = new Cat();
			animal.speak();
		}
		
		else {
			animal = new Animal();
			animal.speak();
		}
		
	
	}

}



/* 

Further Notes:

Polymorphism = many shapes/ formes
Dynamic Polymorphism = after compilation (during runtime)

Example:
BMW is-A BMW
BMW is-A car
BMW is-A Vehicle
BMW is-A Object

*/


