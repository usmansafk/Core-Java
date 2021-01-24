
public class Main {

	public static void main(String[] args) {
		
		Superhero superhero1 = new Superhero();
		
		System.out.println(superhero1.name);
		System.out.println("Gender: " + superhero1.gender);
		System.out.println("Power Level: " + superhero1.powerLevel);
		System.out.println("Hero or Villain?: " + superhero1.heroOrVillain);
		System.out.println("Squad: " + superhero1.team+ "\n");
		
	
		superhero1.power1();
		superhero1.power2();
		superhero1.power3();


	}

}





/* 

Further Notes:

OOP 
object = an instance of a class that may contain attributes and methods
example: phone desk coffeecup computer


attributes = characterstics of the objectt
methods = actions that the object can perform

		 
*/
