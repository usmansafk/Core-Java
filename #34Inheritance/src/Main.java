
public class Main {

	public static void main(String[] args) {
		
		
		Car car = new Car();
		car.go();
		System.out.println(car.doors);
		
		System.out.println();
		
		Bicycle bike = new Bicycle();
		bike.stop();
		System.out.println(bike.speed);
		System.out.println(bike.pedals);

	}

}


/* 

Further Notes:

inheritance = 

the process where one class acquires:
the attributes and meethods of another

use the extends[name of parent class] keyword
to make a class the childclass of another 


in this example, 
the vehicle class is the super/ parent class
and the car and bicycle classes are the child classes


		 
*/
