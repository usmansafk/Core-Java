
public class Main {

	public static void main(String[] args) {
	
		Superheros superman = new Superheros("Superman", 'M', 90, "Hero", "DC", "Medium");
		Superheros batman = new Superheros("Batman", 'M', 78, "Vigilante", "DC", "Medium");
		Superheros spiderman = new Superheros("Spiderman", 'M', 65, "Hero", "Marvel", "Small");
		
		
		System.out.println(superman.name);
		System.out.println("Gender: " + superman.gender);
		System.out.println("Power Level: " + superman.powerLevel);
		System.out.println("Title: " + superman.title);
		System.out.println("Squad: " + superman.team);
		System.out.println("Build" + superman.build);
		
		superman.power1();
		superman.power2();
		superman.power3();
		
		System.out.println();
		
		System.out.println(batman.name);
		System.out.println("Gender: " + batman.gender);
		System.out.println("Power Level: " + batman.powerLevel);
		System.out.println("Title: " + batman.title);
		System.out.print("Squad: " + batman.team);
		System.out.println("Build" + batman.build);
		
		batman.power4();
		batman.power5();
		batman.power6();
		
		System.out.println();
		
		System.out.println(spiderman.name);
		System.out.println("Gender: " + spiderman.gender);
		System.out.println("Power Level: " + spiderman.powerLevel);
		System.out.println("Title: " + spiderman.title);
		System.out.println("Squad: " + spiderman.team);
		System.out.println("Build" + spiderman.build);
		
		spiderman.power4();
		spiderman.power6();
		spiderman.power7();
		spiderman.power8();
			

		
		
	}

}



/* 

Further Notes:

Constructor = special method that is called when an objectt is instantiated (created)

make sure to use the.... this.xxxx
		 
*/
