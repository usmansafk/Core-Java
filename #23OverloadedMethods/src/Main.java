
public class Main {

	public static void main(String[] args) {

		int superhero = powers(20, 25, 10);
		
		if (superhero >= 75) {
			System.out.println("Hero is reached Gold Level");
		} 
		
		else if (superhero >= 50) {
			System.out.println("Hero is reached Silver Level");
		} 
		
		else {
			System.out.println("Hero is Bronze Level");
		}

	}
	
	

	static int powers(int a, int b) {
		int p = a + b;
		System.out.println("Superhero Power Level is " + p );
		return p;
		
	}
	
	static int powers(int a, int b, int c) {
		int p = a + b + c;
		System.out.println("Superhero Power Level is " + p );
		return p;
	}
	
	static int powers(int a, int b, int c, int d) {
		int p = a + b + c;
		System.out.println("Superhero Power Level is " + p );
		return p;
	}


	
}


/* 

Further Notes:

overloaded methods = 
methods that share the same name but have different paramters,
mehod name + paramters = method signature



*/
