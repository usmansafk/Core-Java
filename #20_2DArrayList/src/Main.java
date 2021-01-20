import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> foodShopping = new ArrayList<>();
		
		ArrayList<String> foodList1 = new ArrayList<>();
		
		foodList1.add("pasta");
		foodList1.add("garlic bread");
		foodList1.add("doughnuts");
		
		ArrayList<String> foodList2 = new ArrayList<>();
		
		foodList2.add("chips");
		foodList2.add("bread");
		foodList2.add("apple");
		
		ArrayList<String> foodList3 = new ArrayList<>();
		
		foodList3.add("chicken");
		foodList3.add("orange");
		foodList3.add("pears");
		
		foodShopping.add(foodList1);
		foodShopping.add(foodList2);
		foodShopping.add(foodList3);
		
		System.out.println(foodShopping.get(0).get(2));


	}

}

/* 

Further Notes:

2D ArrayList = dynamic list of lists
Can changge the size of lists at runtime

make sure to add smaller lists to mega ArrayList with the .add()
use the .get method to print specfic.


*/