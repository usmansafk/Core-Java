
public class Main {

	public static void main(String[] args) {
		
		
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		
		System.out.println();
		
		Hawk hawk = new Hawk();
		hawk.attack();
		
		System.out.println();
		
		Fish fish = new Fish();
		
		fish.attack();
		fish.flee();
	

	}

}



/* 

Further Notes:

interface = 
a template that can be applied to a class
similar to inhertiance, but specfies what a class has/must do
classes can apply more than one interface, inheritance is limited to one



		 
*/
