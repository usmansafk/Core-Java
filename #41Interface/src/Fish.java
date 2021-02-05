
public class Fish implements Prey, Predator {

	@Override
	public void attack() {
		System.out.println("**The large fish is attacking the smaller fish**");
		
		
	}

	@Override
	public void flee() {
		System.out.println("**The small fish is fleeing from the larger fish**");
		
	}

}
