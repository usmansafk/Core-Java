
public class Main {

	public static void main(String[] args) {
		
		Food[] fridge = new Food[3];
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("burger");
		Food food3 = new Food("noodles");
		
		//Food[] fridge = {food1, food2, food3};
		
		fridge[0] = food1;
		fridge[1] = food2;
		fridge[2] = food3;
		
		System.out.println(fridge[0].name);
		System.out.println(fridge[1].name);
		System.out.println(fridge[2].name);
		
	}
}


/* 

Further Notes:

2 ways to write create Array of Objects:

	a. create the array of objects first
		Food[] fridge = new Food[3];
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("burger");
		Food food3 = new Food("noodles");
		
	 
	b. create the objects first then the array
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("burger");
		Food food3 = new Food("noodles");
		
		Food[] fridge = {food1, food2, food3};
*/
