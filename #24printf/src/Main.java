
public class Main {

	public static void main(String[] args) {
		
		// made up of two arguments = format string + object||variable||value
		//System.out.printf("This is a format string %d", 123);
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 500000000;
		double myDouble = 1000;
		
		//[conversion-character]
		System.out.printf("%b \n", myBoolean);
		System.out.printf("%c \n", myChar);
		System.out.printf("%s \n", myString);
		System.out.printf("%d \n", myInt);
		System.out.printf("%f \n", myDouble);
		
		
		//[width]
		// minimum number of characters to be written as output
		System.out.printf("\nHello %10s",myString);
						
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		System.out.printf("\nYou have this much money %.2f",myDouble);
						
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000	
		System.out.printf("\nYou have this much money %+,d",myInt);

		}
	
	}







/* 

Further Notes:

printf() method =
can control, format, display text 
made up of two arguments = format string + object||variable||value
% [flags] [precision] [width] [conversion-character]
	


[conversion-character]
boolean %b
char %c
String %s
int %d
double %f

[width]
minimum number of characters to be written as output



[precision]
sets number of digits of precision when outputting floating-point values



[flags]
adds an effect to output based on the flag added to format specifier
		 - : left-justify
		 + : output a plus ( + ) or minus ( - ) sign for a numeric value
		 0 : numeric values are zero-padded
		 , : comma grouping separator if numbers > 1000
		 
		 
		 
		 
*/
