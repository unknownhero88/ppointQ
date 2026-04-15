package Day06;

public class FizzBuzz {
	  static String fizzBuzz(int i) {
	      // TODO: return "FizzBuzz", "Fizz", "Buzz", or String.valueOf(i)
		  if(i%15==0) return "FizzBuzz";
		  else if(i%3==0) return "Fizz";
		  else if(i%5==0) return "Buzz";
		  else return String.valueOf(i);
	      
	  }
	  
	  public static String StringFizzBuzz(int n)
	  {
		  StringBuilder s= new StringBuilder();
		  for (int i = 1; i <= n; i++)
	          s.append(fizzBuzz(i)).append(" ");
		  
		  return s.toString().trim();
	  }
	  
	  public static void main(String[] args) {
	      System.out.println(StringFizzBuzz(20));
	  }
	}
