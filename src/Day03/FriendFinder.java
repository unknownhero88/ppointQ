package Day03;

import java.util.*; 
public class FriendFinder 
{ 
	public static Set<String> mutual_friends(Set<String> friends1, Set<String> friends2) {
		Set<String> mutual = new HashSet<>(friends1);
		mutual.retainAll(friends2);
		return mutual;
	}
	
	public static Set<String> only_Rahul_friends(Set<String> friends1, Set<String> friends2) {
		Set<String> onlyRahul = new HashSet<>(friends1);
		onlyRahul.removeAll(friends2);
		return onlyRahul;
	}
	
	public static Set<String> combined_friends(Set<String> friends1, Set<String> friends2) {
		Set<String> combined = new HashSet<>(friends1);
		combined.addAll(friends2);
		return combined;
	}
	
	public static Set<String> total_count(Set<String> friends1, Set<String> friends2) {
		return combined_friends(friends1, friends2);
	}
	public static void main(String[] args) 
	{ 
		HashSet<String> rahulFriends = new HashSet<>( Arrays.asList("Amit","Priya","Rohan","Sneha","Karan") ); 
		HashSet<String> priyaFriends = new HashSet<>( Arrays.asList("Rohan","Sneha","Ankit","Divya") ); 
		// Write your code here — use copies! 
		System.out.println("Common: " + mutual_friends(rahulFriends, priyaFriends));
		System.out.println("Only Rahul's : " + only_Rahul_friends(rahulFriends, priyaFriends));
		System.out.println("All friends: " + combined_friends(rahulFriends, priyaFriends));
		System.out.println("Total Unique : " + total_count(rahulFriends, priyaFriends).size());
		
			}
	}