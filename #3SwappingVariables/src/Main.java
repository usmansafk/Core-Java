
public class Main {

	public static void main(String[] args) {
		
		String a = "Banana"; // becomes Apple
		String b = "Apple"; // becomes Banana 
		String temp1; // becomes Banana
		
		temp1 = a;
		a = b;
		b = temp1;
		
		
		
		
		System.out.println("a: " + a);

		System.out.println("b: " + b);
		
		//System.out.println(temp1);
		
		System.out.println();
		
		String x = "Water";
		String y = "Kool-Aid";
		String temp2;
		
		temp2=x;
		x=y;
		y=temp2;
		
		
		System.out.println("x: " + x);
		System.out.println("x: " + y);
		
		
		
		
	

	}

}


/* 

Notes:

Since java does not have a specific method to switch variable over,
you can a manually do this with a third variable.



*/







