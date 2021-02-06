
public class Main {

	public static void main(String[] args) {
		
		 Car car  = new Car();
		 Bike bike = new Bike();
		 Boat boat  = new Boat();
		 
		 Vehicle[] racers = {car, bike, boat};
		 
		 for (Vehicle x : racers) {
			 x.go();
		 }
		 
		
		
		
	}

}


/* 

Further Notes:

polymorphism = 		greek work --- poly "many", morph"form"
					ability of an object to identify as more than one data type

		 
*/
