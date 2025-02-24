package a3csII;

import java.util.ArrayList;

public class Invoice {

	private a3csII.Address billingAddress;
	ArrayList<LineItem> items = new ArrayList<LineItem>();

	// Constructors/Methods
	public Invoice(Address address) {
		this.billingAddress = address;
		this.items = new ArrayList<LineItem> ();

	}
	//Getters and setters
	public ArrayList<LineItem> getItems() {
		return this.items;
	}

	public void setItems(ArrayList<LineItem> items) {
		this.items = items;
	}
	//Methods
	public void addCharge (Product product, int quantity) {
		items.add(new LineItem (product,quantity));
	}

	public double getTotalDue () {
		double finalTotal =0;
		for (int i = 0; i<items.size(); i++) {
			finalTotal = finalTotal + items.get(i).getTotalPrice();
		}
		return finalTotal;
	}
@Override
public String toString() {
	String finalInvoice;
	finalInvoice = (billingAddress + "\n" + "Decription \tPrice\t\tQuantity\tTotal\n");
	
	//Print out product on each Line
	for (int i =0; i < items.size(); i++) {
		LineItem currentItem = items.get(i);
		finalInvoice = finalInvoice + (currentItem.getProduct().getDescription() + " \t" + currentItem.getProduct().getPrice() 
				 + "\t\t" + currentItem.getQuantity() + "\t\t" + currentItem.getTotalPrice() + "\n");
	}
	finalInvoice = finalInvoice + ("\nAmount Due $: " + getTotalDue());
	return finalInvoice;
}

	
}
