
public class Main {

	public static void main(String[] args) {
	
		String name = "Usman";
		int age = 23;
		hello(name, age);
		
		
		int a = 12;
		int b = 78;
		int c = 91;
		//int d = addNumbers(a,b,c);
		System.out.println(addNumbers(a,b,c));
		
	}
	
	static void hello(String name, int age) {
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years of age");
	}
	
	
	
	static int addNumbers(int a, int b, int c) {	
		//int d = a + b + c;
		return a + b + c;	
	}
	
	

}




/* 

Further Notes:

methods = block of code that is executed whenever it is called upon

since main method is static, the hello method needs to be stated as static aswell. 

arguements = when you pass in values or variables to a method BUT... you must include:
paramaters = when you declare the method, it MUST have matching set of paramaters 




*/