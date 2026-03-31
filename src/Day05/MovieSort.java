package Day05;

import java.util.*;

public class MovieSort {
	
    public static void main(String[] args) {

        // Each movie: {title, year, rating}
        List<String[]> movies = new ArrayList<>();
        movies.add(new String[]{"Interstellar",    "2014", "8.7"});
        movies.add(new String[]{"Inception",       "2010", "8.8"});
        movies.add(new String[]{"The Dark Knight", "2008", "9.0"});
        movies.add(new String[]{"Parasite",        "2019", "8.5"});
        movies.add(new String[]{"Dune",            "2021", "8.0"});

        // Write your code below
        
        movies.sort((a,b)->Double.compare(Double.parseDouble(b[2]), Double.parseDouble(a[2])));
        
        System.out.print("By rating:");
        for (String[] movie : movies) {
        				System.out.print(movie[0]+"("+movie[2]+") ");
        }
        System.out.println();
        
        movies.sort((a,b)->Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1])));
        
        System.out.print("By year:");
        for(String[] movie : movies)
		{
			System.out.print(movie[0]+"("+movie[1]+") ");
		}
        
        System.out.println();
		
		movies.sort((a,b)->a[0].compareTo(b[0]));
		
		System.out.print("Alphabetically: ");
		for(String[] movie : movies)
		{
			System.out.print(movie[0]+" , ");
		}
		System.out.println();
		
		System.out.print("Rating > 8.5: ");
		for(String[] movie : movies)
		{
			if(Double.parseDouble(movie[2])>8.5)
			{
				System.out.print(movie[0]+" , ");
			}
		}
		System.out.println();
		
    }
}
