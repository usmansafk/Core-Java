
public class Car {

	String make = "BMW";
	String model = "318d";
	int year = 2014;
	String colour = "white";
	
	@Override
	public String toString() { // overriding the toString() method
		
		//String myString=make + "\n" + model + "\n" + year +" \n" + colour;
		//return myString;
		
		// or a simpler way to writre this is:
		return make + "\n" + model + "\n" + year +" \n" + colour;
		
		 
	}

	
	
}
