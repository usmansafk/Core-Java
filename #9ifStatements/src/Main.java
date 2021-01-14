import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How old are you?");
		age= scanner.nextInt();
		
		
		if (age == 15) {
			System.out.println("You are 15.");
		}
		else if (age > 30) {
			System.out.println("LOL! You are soooo old!");
		}
		else if (age >= 21 && age <30) {
			System.out.println("You are a adult.");
		}
		else if (age >= 13 && age <=19 ) {
			System.out.println("You are a teen...");
		}
		else {
			System.out.println("Ha! you are a baby.");
		}

		scanner.close();
		
	}

}



/* 

Further Notes:

if statements = performs a block of code, IF the condition is true


*/