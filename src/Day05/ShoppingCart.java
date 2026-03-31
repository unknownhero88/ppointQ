package Day05;

import java.util.*;


public class ShoppingCart {
	
	public static List<String[]> in_stock(List<String[]> cart)
	{
		List<String[]> in_stockList=new ArrayList<>();
		
		for(int i=0;i<cart.size();i++)
		{
			if(Boolean.parseBoolean(cart.get(i)[2]))
			{
				in_stockList.add(cart.get(i));
			}
		}
		
		return in_stockList;
	}
	
	public static List<Double> discountedPriceList(List<String[]> carts)
	{
		List<Double> discountedPriceList=new ArrayList<>();
		
		for(String[] cart:carts)
		{
			double desAmt =Double.parseDouble(cart[1])*0.1;
			double finalAmt = Double.parseDouble(cart[1])-desAmt;
			discountedPriceList.add(finalAmt);
		}
		return discountedPriceList;
	}
	
	public static double totalBill(List<Double> ls)
	{
		double billAmt=0;
		for(double amt:ls) billAmt+=amt;
		return billAmt;
	}
	
	public static void mostExpensive(List<String[]> carts)
	{
		String[] mostExpensiveItem = carts.get(0);
		int cartMax = Integer.parseInt(carts.get(0)[1]);
		for(String[] cart:carts)
		{
			if(cartMax<Integer.parseInt(cart[1]))
			{
				cartMax=Integer.parseInt(cart[1]);
				mostExpensiveItem=cart;
			}
		}
		double desAmt =Double.parseDouble(mostExpensiveItem[1])*0.1;
		double finalAmt = Double.parseDouble(mostExpensiveItem[1])-desAmt;
		System.out.println("Most expensive: "+mostExpensiveItem[0]+" at ₹"+finalAmt);
	}
	
    public static void main(String[] args) {

        // {item, price, inStock}  — price as String for easy storage
        List<String[]> cart = new ArrayList<>();
        cart.add(new String[]{"Laptop",   "80000", "true"});
        cart.add(new String[]{"Mouse",    "1200",  "true"});
        cart.add(new String[]{"Keyboard", "3500",  "false"});
        cart.add(new String[]{"Monitor",  "25000", "true"});
        cart.add(new String[]{"Webcam",   "4500",  "false"});

        // Write your code below
        
        System.out.print("In-stock items: ");
        for(String[] In_stockcart:in_stock(cart))
        {
        	System.out.print(In_stockcart[0]+", ");
        }
        System.out.println();
        System.out.println("Discounted prices:"+discountedPriceList(in_stock(cart)));
        System.out.println("Total bill: ₹"+totalBill(discountedPriceList(in_stock(cart))));
        mostExpensive(in_stock(cart));
    }
}
