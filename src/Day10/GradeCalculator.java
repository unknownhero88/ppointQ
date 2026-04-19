package Day10;

import java.util.*;

public class GradeCalculator {

	static String getGrade(int score) {
		// TODO: implement if/else if chain for the grading scale
		if (score >= 90 && score <= 100)
			return "A";
		else if (score >= 80)
			return "B";
		else if (score >= 70)
			return "C";
		else if (score >= 60)
			return "D";
		else if (score > 0)
			return "F";
		return "out of Range !!";
	}

	static void classReport(HashMap<String, Integer> students) {
		// TODO: loop through entrySet(), print name, score, grade
		double total = 0;
		String topperName = "";
		int topperScore = Integer.MIN_VALUE;
		for (Map.Entry<String, Integer> std : students.entrySet()) {
			System.out.println(std.getKey() + ": " + std.getValue() + " -> " + getGrade(std.getValue()));
			total += std.getValue();
			if (topperScore < std.getValue()) {
				topperScore = std.getValue();
				topperName = std.getKey();
			}
		}
		// TODO: calculate and print the average
		double avg = total / students.size();
		System.out.println("Class average: " + avg);

		// TODO: find and print the top student

		System.out.println("Top student: " + topperName + " (" + topperScore + ")");
	}

	public static void main(String[] args) {
		HashMap<String, Integer> students = new HashMap<>();
		students.put("Rahul", 85);
		students.put("Priya", 92);
		students.put("Arjun", 58);
		students.put("Sneha", 74);
		students.put("Vikram", 67);
		classReport(students);
	}
}
