
public class Main {

	public static void main (String [] args) {
		
		Car car1 = new Car("BMW", "318d", 2014);
		
		//copy method 1 = using copy method
		Car car2 = new Car("Audi", "RS6", 2021);
		car2.copy(car1);
		
		//copy method 2 = using overloaded Car constructer
		Car car3 = new Car(car2);
		
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		System.out.println();
		
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		
		System.out.println();
		
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
		System.out.println();
		
		System.out.println(car3.getMake());
		System.out.println(car3.getModel());
		System.out.println(car3.getYear());
		
		
		
		
	}

}


/* 

Further Notes:

Copying objects
> How to copy car1 into car2

DON'T state car2=car1;		this will appear that it has copied over, however in reality both car1 and car2 are just pointing to the same objectt

You must create a copy method in the car class




		 
*/
