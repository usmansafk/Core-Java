import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		
		scanner.nextLine(); // clears scanner in prep for the user request
		
		
		System.out.println("What is your favourite food?");
		String favFood = scanner.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("Your favourite food is " + favFood);
		

	}

}





/* 
 
Further Notes:

Scanner is used to accept user input
The Scanner class is from the Java utility package, needs to be imported.

System.in 
used for "standard" input stream. This stream is already open and ready to supply input data.

scanner.nextLine() if a string		 OR 		nextInt() if a an int		 OR 		nextDouble() if a double,
advances this scanner past the current line and returns the input that was skipped. This method returns the rest of the current line, excluding any line separator at the end. The position is set to the beginning of the next line.

NEED to put scanner.nextLine(); AFTER using a nextInt() to clear the scanner and get user input properly.

*/

