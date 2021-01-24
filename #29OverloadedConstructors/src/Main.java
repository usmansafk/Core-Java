
public class Main {

	
	public static void main(String[] args) {
		
		Pizza pizza = new Pizza("thic crust", "tomato", "mozzeralla", "pepporoni");
		System.out.println("Here are the ingredients for your pizza:");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		
		System.out.println();
		
		Pizza pizza2 = new Pizza("thic crust", "tomato", "mozzeralla");
		System.out.println("Here are the ingredients for your pizza:");
		System.out.println(pizza2.bread);
		System.out.println(pizza2.sauce);
		System.out.println(pizza2.cheese);
	
	}

}


/* 

Further Notes:

Overloaded constructors = 
multiple constructtors within a class with the same name
but have different parameters
name + paramters = signature

		 
*/
