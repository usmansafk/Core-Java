
public class Main {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car myCar = new Car("BMW");
		Car dreamCar = new Car("Tesla");
		
		
		garage.park(myCar);
		garage.park(dreamCar);
		System.out.println( "...I wish");
		
		

	}

}



/* 

Further Notes:


		 
*/
