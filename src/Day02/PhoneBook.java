package Day02;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Rahul", "9876543210");
        phoneBook.put("Priya", "9123456789");
        phoneBook.put("Arjun", "9988776655");

        // Write your code below — complete each task one by one

        
        phoneBook.put("Sneha", "9001122334");
        
        if (phoneBook.containsKey("Sneha")) 
        				System.out.println("Sneha added!");
        				 else 
							 System.out.println("Failed to add Sneha!");
        
        
        if (phoneBook.containsKey("Priya")) {
			System.out.println("Priya's number: " + phoneBook.get("Priya"));
		} else {
			System.out.println("Priya not found!");
		}
        
        phoneBook.remove("Arjun");
        
        if (!phoneBook.containsKey("Arjun")) 
						System.out.println("Arjun deleted!");
						 else
							 System.out.println("Failed to remove Arjun!");
		
		TreeMap<String, String> sortedPhoneBook = new TreeMap<>(phoneBook);
		System.out.println("All contacts:");
		for (Map.Entry<String, String> entry : sortedPhoneBook.entrySet()) {
			System.out.print(entry.getKey()+" | ");
		}
		System.out.println();
		System.out.print("Searching Virat...");
		if (phoneBook.containsKey("Virat")) {
			System.out.println("Virat's number: " + phoneBook.get("Virat"));
		} else {
			System.out.println("Contact not found!");
		}
	}
}
