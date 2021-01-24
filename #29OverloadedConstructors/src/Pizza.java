
public class Pizza {

	//in-order to make bread sauce cheese topping
	
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	
	Pizza(String bread,String sauce,String cheese,String topping){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;		
	}
	
	Pizza(String bread,String sauce,String cheese){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;	
	}
	
	Pizza(String bread,String sauce){
		
		this.bread = bread;
		this.sauce = sauce;
	}
	
	Pizza(String bread){
		
		this.bread = bread;
	}
	
	Pizza(){
	}
	
	
}
