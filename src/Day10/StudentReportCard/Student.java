package Day10.StudentReportCard;

import java.util.HashMap;
import java.util.Map;

class Student {
	String name;
	HashMap<String, Integer> scores;

	Student(String name, HashMap<String, Integer> scores) {
		// TODO: store name and scores
		this.name = name;
		this.scores = scores;
	}

	double average() {
		// TODO: return average of all scores
		double total = 0;
		for (Map.Entry<String, Integer> std : scores.entrySet())
			total += std.getValue();
		return total / scores.size();
	}

	String highestSubject() {
		// TODO: return subject name with the highest score
		int max = Integer.MIN_VALUE;
		String name="";
		for (Map.Entry<String, Integer> std : scores.entrySet())
		{
			if(max<std.getValue())
			{
				max=std.getValue();
				name=std.getKey();
			}
		}
		return "Best: "+name;
	}

	String lowestSubject() {
		// TODO: return subject name with the lowest score
		int min = Integer.MAX_VALUE;
		String name="";
		for (Map.Entry<String, Integer> std : scores.entrySet())
		{
			if(min>std.getValue())
			{
				min=std.getValue();
				name=std.getKey();
			}
		}
		return "Weakest: "+name;
	}

	void report() {
		// TODO: print header, each subject and score, average, best, weakest
		System.out.println("--- "+name+"'s Report ---");
		for (Map.Entry<String, Integer> std : scores.entrySet())
		{
			System.out.println(std.getKey()+": "+std.getValue());
		}
		System.out.println("Average: "+average());
		System.out.println(highestSubject());
		System.out.println(lowestSubject());
		
	}
}
