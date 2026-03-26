package Day03;

import java.util.*; 

public class GradeManager 
{ 
	public static void print_avg(HashMap<String,Integer> gades) {
		int total = 0;
		for (int grade : gades.values()) {
			total += grade;
		}
		double average = (double) total / gades.size();
		System.out.println("Average :" + average);
	}
	
	public static List<String> passed_students(HashMap<String,Integer> gades) {
		List<String> passed = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : gades.entrySet()) {
			if (entry.getValue() >= 50) {
				passed.add(entry.getKey());
			}
		}
		return passed;
	}
	
	public static List<String> failed_students(HashMap<String,Integer> gades) {
		List<String> failed = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : gades.entrySet()) {
			if (entry.getValue() < 50) {
				failed.add(entry.getKey());
			}
		}
		return failed;
	}
	
	public static void toppers_name(HashMap<String,Integer> gades) {
		String topper = "";
		int highestGrade = 0;
		for (Map.Entry<String, Integer> entry : gades.entrySet()) {
			if (entry.getValue() > highestGrade) {
				highestGrade = entry.getValue();
				topper = entry.getKey();
			}
		}
		System.out.println("Topper: " + topper + " with " + highestGrade + " marks");
	}	
	public static void main(String[] args) 
	{ 
		HashMap<String, Integer> grades = new HashMap<>(); 
		grades.put("Rahul", 72); 
		grades.put("Priya", 85); 
		grades.put("Arjun", 40); 
		grades.put("Sneha", 91); 
		grades.put("Vikram", 55); 
		// Write your code here 
		
		print_avg(grades);
		System.out.println("Passed: "+passed_students(grades));
		System.out.println("Failed: "+failed_students(grades));
		toppers_name(grades);
	}
}
