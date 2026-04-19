package Day10.StudentReportCard;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<String, Integer> r = new HashMap<>();
		r.put("Maths", 88);
		r.put("Science", 74);
		r.put("English", 91);
		HashMap<String, Integer> p = new HashMap<>();
		p.put("Maths", 95);
		p.put("Science", 89);
		p.put("English", 78);
		new Student("Rahul", r).report();
		new Student("Priya", p).report();
	}
}
