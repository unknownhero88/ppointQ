package Day07.ShoppingCartAnalyser;

import java.util.ArrayList;

public class ShoppingCart {
	public static double totalBill(ArrayList<CartItem> cart) {
		double totalBill = 0;
		for (CartItem c : cart) {
			totalBill += c.price * c.qty;
		}
		return totalBill;
	}

	public static CartItem mostExpensive(ArrayList<CartItem> cart) {
		CartItem mostExpensive = cart.get(0);

		for (CartItem c : cart) {
			if (mostExpensive.price < c.price) {

				mostExpensive = c;
			}
		}
		return mostExpensive;
	}

	public static void applyDis(ArrayList<CartItem> cart) {
		for (CartItem c : cart) {
			if (c.price * c.qty > 1000) {
				c.price *= 0.9;
			}
		}
	}

	public static ArrayList<String> multi_qty_items(ArrayList<CartItem> cart) {
		ArrayList<String> multi_qty_items = new ArrayList<>();
		for (CartItem c : cart) {
			if (c.qty > 1)
				multi_qty_items.add(c.name);
		}
		return multi_qty_items;
	}

	public static void main(String[] args) {
		ArrayList<CartItem> cart = new ArrayList<>();
		cart.add(new CartItem("Laptop", 45000, 1));
		cart.add(new CartItem("Mouse", 800, 2));
		cart.add(new CartItem("Keyboard", 1500, 1));
		cart.add(new CartItem("Pen Drive", 600, 3));
		cart.add(new CartItem("Charger", 1200, 1));

		// Task 1: total bill
		System.out.println("Total: ₹" + totalBill(cart));
		// Task 2: apply discount
		applyDis(cart);
		// Task 3: most expensive
		CartItem mostExpensive = mostExpensive(cart);
		System.out.println("Most expensive: " + mostExpensive.name + " (₹" + mostExpensive.price + ")");
		// Task 4: multi-qty items
		System.out.println("Multi-qty: " + multi_qty_items(cart));

	}
}