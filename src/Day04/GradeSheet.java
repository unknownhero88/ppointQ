package Day04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GradeSheet {

    public static void name_totalM(String[] names,int[][] marks)
    	{
		for(int i=0;i<names.length;i++)
		{
			int totalM =0;
			for(int j=0;j<marks[0].length;j++)
			{
				totalM+=marks[i][j];
			}
			System.out.print(names[i]+": "+totalM+" | ");
		}
		System.out.println();
	}

    public static void topper(String[] names,int[][] marks)
	{
		String topper_name="";
		int topper_marks=0;
		for(int i=0;i<names.length;i++)
		{
			int totalM =0;
			for(int j=0;j<marks[0].length;j++)
			{
				totalM+=marks[i][j];
			}
			if(totalM>topper_marks)
			{
				topper_marks=totalM;
				topper_name=names[i];
			}
		}
		System.out.println("Class topper: "+topper_name+" ("+topper_marks+")");
	}

    public static List<String> failedS(String[] names,int[][] marks)
	{
		List<String> Fnames= new ArrayList<>();
		for(int i=0;i<names.length;i++)
		{
			
			for(int j=0;j<marks[0].length;j++)
			{
				if(marks[i][j]<50)
				{
					Fnames.add(names[i]);
					break;
				}
			}
			
		}
		return Fnames;	
	}


    public static HashMap<String, Double> average(String[] names, int[][] marks, String[] subjects)
    {
        HashMap<String, Double> avgMap = new HashMap<>();
        for (int j = 0; j < subjects.length; j++)   
        {
            double totalM = 0;
            for (int i = 0; i < names.length; i++)      
            {
                totalM += marks[i][j];
            }
            double avgM = totalM / names.length;
            avgMap.put(subjects[j], avgM);
        }
        return avgMap;
    }

	

    public static void main(String[] args) {

        String[] names = {"Rahul", "Priya", "Arjun", "Sneha", "Vikram"};
        String[] subjects = {"Maths", "Science", "English"};

        // marks[i][j] = student i's marks in subject j
        int[][] marks = {
            {78, 85, 72},
            {92, 88, 95},
            {45, 38, 62},
            {88, 91, 80},
            {55, 48, 70},
        };

        // Write your code below
        
        name_totalM(names, marks);
        topper(names, marks);
        System.out.println("Failed students: "+failedS(names, marks));
        HashMap<String, Double> avgMap =average(names, marks, subjects);
        for(Map.Entry<String,Double> HMap:avgMap.entrySet())
        {
        	System.out.print(HMap.getKey()+" avg: "+HMap.getValue()+" |");
        }
        
    }
}