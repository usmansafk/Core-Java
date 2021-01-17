import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("burger");
		food.add("noodles");
		
		food.set(0, "sushi");
		food.remove(1);
		//food.clear();
		
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}

	}

}


/* 

Further Notes:

ArrayList = 
resizeable array.
Elementts can be added and removed after compilation phase
store reference data types

to find out size of array in ArrayList use size()
to retrieve/ display something from an ArrayList, use get function

Useful methods of ArrayList
.add(" ");
.remove(index, " ")
.clear()

*/