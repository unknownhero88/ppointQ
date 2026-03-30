package Day04;

import java.util.*;

public class WordFrequency 
	{
	public static HashMap<String,Integer> SplitInMap(String s)
		{
			HashMap<String,Integer> HS = new HashMap<>();
			String []s1=s.split(" ");
			for(String i:s1)
			{
				if(HS.containsKey(i))
				{
					HS.put(i,HS.get(i)+1);
				}
				else
				{
					HS.put(i,1);
				}
			}
			return HS;
		}


	public static void most_frequent(HashMap<String,Integer> HMap)
		{
			String str=" ";
			int max=0;
			for(Map.Entry<String,Integer> HM:HMap.entrySet())
				{
					if(HM.getValue()>max)
					{
						max=HM.getValue();
						str=HM.getKey();
					}
				}
			System.out.println("Most frequent: "+str+" ("+max+" times");
		}

	public static List<String> Repeated_words(HashMap<String,Integer> HMap)
		{
			List<String> repated = new ArrayList<>();
			for(Map.Entry<String,Integer> HM : HMap.entrySet())
				{
					if(HM.getValue()>1)
						{
							repated.add(HM.getKey());
						}
				}
			return repated;
		}

	public static void main(String[] args)
		{

        		String sentence = "the cat sat on the mat the cat sat";
			// Write your code below
			HashMap<String,Integer> HMap = SplitInMap(sentence);
			
			System.out.println("Frequency:"+HMap);
			
			most_frequent(HMap);
			List<String> repeated = Repeated_words(HMap);
			System.out.println("Repeated words: "+repeated);
			
		}
	}
