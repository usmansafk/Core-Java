
public class Main {

	public static void main (String [] args) {
		
		Car car = new Car("BMW", "318d", 2014);
		
		car.setYear(2021);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
	
		
	}
	
	
}



/* 

Further Notes:

Encapsulation

attributes of a class will be hidden or private
can be accessed only through methods (getters and setters)
you should make attributes private, if you dont have a reason for them to be public/protected


		 
*/
