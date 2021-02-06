import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("This program divides two numbers.");
		
		

		Scanner scanner  = new Scanner(System.in);
		
		
		
		try  {
			System.out.println("Please enter the first number: ");
			int a = scanner.nextInt();

			System.out.println("Please enter the second number: ");
			int b = scanner.nextInt();
			
			int c = a / b;
			
			System.out.println("Your answer is: "+ c);
		}
		
		catch(ArithmeticException e) {
			System.out.println("You can't divide by 0");
		}
		
	
		catch(Exception e) {
			System.out.println("Something went wrong.");
		}
		
	
		finally {
			System.out.println("\nThis always prints.");
		}
		
		
	}

}


/* 

Further Notes:

Exception Handling 
exception = an event that occurs during the execution of a program that,
disrupts the normal flow of instructions

use try/catch block

risky code is surrounded by a try block
cure is placed in the catch block


finally block is code that will run no matter what.

Use this code as a general catch:
		catch(Exception e) {
				System.out.println("Something went wrong.");
			}
Although it is best practice to set indivdual catch code. 
		 
*/
