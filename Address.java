package a3csII;

public class Address {

	// Declare class's data members as private
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;

	// Create constructors
	public Address() {
		this.name = "";
		this.street = "";
		this.city = "";
		this.state = "";
		this.zip = "";
	}

	public Address(String name, String street, String city, String state, String zip) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	// Create getters and setters
	public String getName() {
		return this.name;
	}

	public String getStreet() {
		return this.street;
	}

	public String getCity() {
		return this.city;
	}

	public String getState() {
		return this.state;
	}

	public String getZip() {
		return this.zip;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
 public String toString() {
	 return ("SALES INVOICE\n\n" + this.name + "\n" + this.street + "\n" + this.city + ", "+ this.state + " " + this.zip +"\n\n");
 }
}
