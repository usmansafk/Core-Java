
public class Main {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println(myCar);// used implicitly
		System.out.println();
		System.out.println(myCar.toString()); // used explicity
	}		
}


/* 

Further Notes:

toString()		special method that all object inherit,
				thatt returns a string that "textually represents" an object.
				can be used both implicitly and explicity 

		 
*/
