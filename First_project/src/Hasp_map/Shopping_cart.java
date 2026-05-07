package Hasp_map;
import java.util.*;
public class Shopping_cart {

	public static void main(String[] args) {
		Map<String, Double> product = new HashMap<>();
		product.put("Laptop", 1200.00);
		product.put("Mouse", 25.50);
		product.put("Keyboard", 45.00);
		product.put("Monitor", 250.00);
		
		List<String> cart = new ArrayList<>();
		
		cart.add("Laptop");
		cart.add("Mouse");
		cart.add("Mouse"); 
		cart.add("Monitor");
		
		System.out.println("Items in cart: " + cart);
		
		double total = 0.0;
		
		for (String item : cart) {
			if (product.containsKey(item)) {
				total += product.get(item);
			} else {
				System.out.println("Warning: " + item + " is not in the catalog.");
			}
		}
		
		System.out.println("Total Order Cost: " + total);
	}

}
