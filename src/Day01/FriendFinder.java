package Day01;

import java.util.*;

public class FriendFinder {
	
	public static Set<String> CommonFriends(Set<String> friends1, Set<String> friends2) {
		Set<String> common = new HashSet<>(friends1);
		common.retainAll(friends2);
		return common;
	}
	
	public static Set<String> only_rahul_friends(Set<String> friends1, Set<String> friends2) {
		Set<String> onlyRahul = new HashSet<>(friends1);
		onlyRahul.removeAll(friends2);
		return onlyRahul;
	}
	
	public static Set<String> all_friends(Set<String> friends1, Set<String> friends2) {
		Set<String> all = new HashSet<>(friends1);
		all.addAll(friends2);
		return all;
	}
	
	public static Set<String> unique_total_count(Set<String> friends1, Set<String> friends2) {
		Set<String> unique = new HashSet<>(friends1);
		unique.addAll(friends2);
		return unique;
	}
	
    public static void main(String[] args) {

        HashSet<String> rahulFriends = new HashSet<>(
            Arrays.asList("Amit", "Priya", "Rohan", "Sneha", "Karan")
        );
        HashSet<String> priyaFriends = new HashSet<>(
            Arrays.asList("Rohan", "Sneha", "Ankit", "Divya")
        );

        // Write your code below
        		System.out.println("Common :" + CommonFriends(rahulFriends, priyaFriends));
        		System.out.println("Only Rahul's: " + only_rahul_friends(rahulFriends, priyaFriends));
        		System.out.println("All Friends: " + all_friends(rahulFriends, priyaFriends));
        		System.out.println("Total unique : " + unique_total_count(rahulFriends, priyaFriends).size());
        		
    }
}
