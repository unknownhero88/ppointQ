package Day02;

import java.util.*;

public class MarksManager {
	
	public static void average_marks(ArrayList<String[]> students) {
		int totalMarks = 0;
		for (String[] student : students) {
			totalMarks += Integer.parseInt(student[1]);
		}
		double average = (double) totalMarks / students.size();
		System.out.println("Average Marks: " + average);
	}
	
	public static List<String> students_who_passed(ArrayList<String[]> students) {
		System.out.println("Pass:");
		List<String> passedStudents = new ArrayList<>();
		for (String[] student : students) {
			if (Integer.parseInt(student[1]) >= 50) {
				passedStudents.add(student[0]);
			}
		}
		return passedStudents;
	}
	
	public static List<String> students_who_failed(ArrayList<String[]> students) {
		System.out.println("Fail:");
		List<String> failedStudents = new ArrayList<>();
		for (String[] student : students) {
			if (Integer.parseInt(student[1]) < 50) {
				failedStudents.add(student[0]);
			}
		}
		return failedStudents;
	}
	
	public static void  toppers_name(ArrayList<String[]> students) {
		String topper = "";
		int highestMarks = 0;
		for (String[] student : students) {
			int marks = Integer.parseInt(student[1]);
			if (marks > highestMarks) {
				highestMarks = marks;
				topper = student[0];
			}
		}
		System.out.println("Topper: " + topper +"( "+highestMarks+" marks)");	}
	
	
    public static void main(String[] args) {

        ArrayList<String[]> students = new ArrayList<>();
        students.add(new String[]{"Rahul",  "72"});
        students.add(new String[]{"Priya",  "85"});
        students.add(new String[]{"Arjun",  "40"});
        students.add(new String[]{"Sneha",  "91"});
        students.add(new String[]{"Vikram", "55"});

        average_marks(students);
        System.out.println(students_who_passed(students));
        System.out.println(students_who_failed(students));
        toppers_name(students);
        
       
    }
}
