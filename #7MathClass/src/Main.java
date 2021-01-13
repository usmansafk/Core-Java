import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenuse is : " + z);
		
		scanner.close();
		
		/*
		double a = 50;
		double b = 25;
	
		double c = Math.max(a, b);
		System.out.println(c);
		
		
		
		double d = 100;
		double e = 75;
		
		double f = Math.min(d, e);
		System.out.println(f);
		
		
		double g = -35;
		System.out.println(Math.abs(g));
		*/
		
	}

}



/* 

Further Notes:

hypotenuse formula
c = √(a² + b²)


scanner.close(); Good practice to close scanner.


*/