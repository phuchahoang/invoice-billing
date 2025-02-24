package a3csII;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		//Testing the code and run the application
		
		Address fullAdds = new Address ("Sam's Small Appliances", "100 MainStreet", "Anytown", "WI", "54751");
		
		Invoice invoice = new Invoice(fullAdds);
		invoice.addCharge(new Product("Toaster", 29.95), 3);
		invoice.addCharge(new Product("Hair Dryer", 24.95), 1);
		invoice.addCharge(new Product("Car Vacuum", 19.99), 2);
		
		System.out.println(invoice);
	}

}
