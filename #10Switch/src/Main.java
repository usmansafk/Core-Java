import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String day = "pizza";
		
		switch(day) {
		case "Sunday": System.out.println("Today is Sunday");
		break;
		case "Monday": System.out.println("Today is Monday");
		break;
		case "Tuesday": System.out.println("Today is Tuesday");
		break;
		case "Wednesday": System.out.println("Today is Wednesday");
		break;
		case "Thursday": System.out.println("Today is Thursday");
		break;
		case "Friday": System.out.println("Today is Friday");
		break;
		case "Saturday": System.out.println("Today is Saturday");
		break;
		default: System.out.println("That is not a day!");
		}
	}

}


/* 

Further Notes:

switch statement = allows a variable to be tested for equality against a list of value
more efficient to use instead of multiple if statements
*/