package Day08.FibonacciwithIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Task 1: collect all Fibonacci numbers up to 50
		FibIterator it = new FibIterator(50);
		List<Integer> all = new ArrayList<>();
		while (it.hasNext())
			all.add(it.next());
		System.out.println("All up to 50: " + all);

		// Task 2 & 3 below
		
		int sum=0;
		List<Integer> even = new ArrayList<>();
		List<Integer> first8 =new ArrayList<>();
		for(int i:all)
		{
			if(i%2==0)
			{
				even.add(i);
				sum+=i;
			}
			if(first8.size()!=8)
			{
				first8.add(i);
			}
		}
		
		System.out.println("Even fibs: "+even);
		System.out.println("Sum: "+sum);
		System.out.println("First 8: "+first8);
		
	}
}