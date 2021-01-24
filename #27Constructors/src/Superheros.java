
public class Superheros {
	
	String name;
	char gender;
	int powerLevel;
	String title;
	String team;
	String build;
	

	Superheros(	String name, 
				char gender, 
				int powerLevel, 
				String title, 
				String team, 
				String build){
		
		this.name = name;
		this.gender = gender;
		this.powerLevel = powerLevel;
		this.title = title;
		this.team = team;
		this.build = build;
	 
	 }
//-----------------------------------------------------------------------------
	void power1() {
		System.out.println("BAM!" + this.name + " has super strength!");
	}
	void power2() {
		System.out.println(this.name + " is flying");
	}
	void power3() {
		System.out.println(this.name + " is firing laser eyes!!");
	}
	void power4() {
		System.out.println(this.name + " has amazing martial arts");
	}
	void power5() {
		System.out.println("Damn! " + this.name + " is richhh!");
	}
	void power6() {
		System.out.println(this.name + " has high intelligence");
	}
	void power7() {
		System.out.println(this.name + "can shoot webs!");
	}
	void power8() {
		System.out.println(this.name + "can swing!!");
	}
	
}
