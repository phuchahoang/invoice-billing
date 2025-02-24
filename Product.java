package a3csII;

public class Product {

	private String description;
	private double price;
	
	//Constructors
	public Product() {
		this.description = "";
		this.price = 0;
	}
	public Product (String description, double price) {
		this.description = description;
		this.price = price;
	}
	//Getters
	public String getDescription() {
		return this.description;
	}
	public double getPrice() {
		return this.price;
	}
	//Setters
	public void setDescription (String description) {
		this.description = description;
	}
	public void setPrice (double price) {
		this.price = price;
	}
}
