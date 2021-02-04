
public class Main {

	public static void main(String[] args) {
	
	//Vehicle vehicle = new Vehicle();
	//>>>doesn't work!

	Car car = new Car();
	car.go();
	
	}
}



/* 

Further Notes:

abstract keyword =

abstract classes,
cannot be instantiated(cant create objects of that class) but they can have a subclass using the extends keyword
abstract methods are declared without implementation

adding abstract keyword creates a layer of security

can make abstract classes or methods

abstract methods are without a body, so no curly braces, forces you to implement in the child classes

		 
*/
