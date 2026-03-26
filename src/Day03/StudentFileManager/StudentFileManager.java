package Day03.StudentFileManager;

import java.io.*; 
import java.util.*; 

public class StudentFileManager 
	{ 
	
		public static final String PATH = "D:\\pro\\hibernate-programs\\PPointQ\\src\\Day03\\StudentFileManager\\StudentFiles\\";
		static String[][] students = 
			{ 
				{"Rahul", "72"}, 
				{"Priya", "85"}, 
				{"Arjun", "40"}, 
				{"Sneha", "91"} 
			}; 
		public static void saveToFile(String filename) throws IOException 
			{ 
				// Write each student as "Name,Marks" on each line 
			
				String filePath = PATH + filename;
				FileWriter writer = new FileWriter(filePath);
				for (String[] student : students) {
					writer.write(student[0] + "," + student[1] + "\n");
				}
				writer.close();
				System.out.println("Saved 4 students to students.txt");
			} 

		public static void readFromFile(String filename) throws IOException 
			{ 
				// Read each line, split by comma, print name and marks 
				String filePath = PATH + filename;
				BufferedReader reader = new BufferedReader(new FileReader(filePath));
				String line;
				int totalStudents = 0;
				String[] topper = new String[2];
				System.out.println("--- Reading from file ---");
				while ((line = reader.readLine()) != null) {
					String[] parts = line.split(",");
					if (parts.length == 2) {
						System.out.println(parts[0] + ": "+ parts[1]+" Marks" );
						totalStudents++;
					}
					int topperMarks = 0;
					if(Integer.parseInt(parts[1])>topperMarks)
						{
							topperMarks=Integer.parseInt(parts[1]);
							topper=parts;
						}
				}
				System.out.println("Total students: "+totalStudents+" | Topper: "+topper[0]+" ("+topper[1]+")");
				reader.close();
			} 
		public static void main(String[] args) throws IOException
			{ 
				saveToFile("students.txt"); 
				readFromFile("students.txt"); 
			} 
	}