package Day06;

import java.text.Collator;
import java.util.*;
import java.util.stream.*;

public class DataClean {
  public static void main(String[] args) {
    List<Integer> scores = Arrays.asList(45,82,91,33,67,55,78,29,95,61);
    List<String>  names  = Arrays.asList("rahul","PRIYA","Arjun","sneha","VIKRAM");

    // Task 1: passing scores (>= 60)
    List<Integer> passing = scores.stream()
        .filter(x -> x >= 60)
        .collect(Collectors.toList());
    System.out.println("Passing: " + passing);

    // Write Tasks 2–5 below
    
    List<Integer> squares = scores.stream()
    		.map(x->x*x)
    		.collect(Collectors.toList());
    
    List<String> Grades = scores.stream()
    		.map(x->x>=80?"A":(x>=60?"B":"C")
    			)
    		.collect(Collectors.toList());
    
    System.out.println("Grades: "+Grades);
    
    List<String> capitalize = names.stream()
    		.map(s->s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase())
    		.collect(Collectors.toList());
    
    System.out.println("Names: "+capitalize);
    		
    List<Integer> evenand50 =scores.stream()
    		.filter(x-> x>=50 && x%2==0)
    		.collect(Collectors.toList());
    System.out.println("Above 50 & even: "+evenand50);
  }
  
  }
