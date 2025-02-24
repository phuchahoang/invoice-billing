package a3csII;

public class LineItem {

	private int quantity;
	private a3csII.Product product;

//Constructors
	public LineItem() {
		this.quantity = 0;
		product.setDescription("");
		product.setPrice(0);
	}

	public LineItem(Product product, int quantity) {
		this.quantity = quantity;
		this.product = product;
	}

//Getters
	public Product getProduct() {
		return this.product;
	}

	public int getQuantity() {
		return this.quantity;
	}

//Setters
	public void setProduct(Product product) {
		this.product = product;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

//Get the total Price
	public double getTotalPrice() {
		return product.getPrice() * quantity;
	}

	@Override
	public String toString() {
		return (product.getDescription() + "\t" + product.getPrice() +"\t\t" + quantity + "\t\t" + getTotalPrice() + "\n");
	}

}
