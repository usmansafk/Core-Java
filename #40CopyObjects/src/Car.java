
public class Car {

	//private variables
	private String make;
	private String model;
	private int year;
	
	//constructor
	Car(String make, String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	//overloaded constructor
	Car(Car x){
		this.copy(x);
	}
	
	
	
	
	
	//getter methods
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	//setter methods
	public void setMake(String make) {
		this.make=make;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	
	//copy method
	public void copy(Car x) {
		this.setMake(x.getMake());
		this.setModel(x.model);
		this.setYear(x.getYear());
	}
	
}
	
	
	
	
	