package Day06;

public class NumWords {
	  static String[] ones = {"","One","Two","Three","Four","Five",
	      "Six","Seven","Eight","Nine","Ten","Eleven","Twelve",
	      "Thirteen","Fourteen","Fifteen","Sixteen",
	      "Seventeen","Eighteen","Nineteen"};
	  static String[] tens = {"","","Twenty","Thirty","Forty",
	      "Fifty","Sixty","Seventy","Eighty","Ninety"};

	  static String toWords(int n) {
	      if (n == 0)  return "Zero";
	      if (n < 20)  return ones[n];
	      if (n < 100) return (tens[n/10] + " " + ones[n%10]).trim();
	      // TODO: handle 100–999
	      if(n%100==0) return (ones[n/100]+ " Hundred ").trim();
	      if(n<1000)   return (ones[n/100]+ " Hundred "+ toWords(n%100)).trim();
	      return "";
	  }
	  public static void main(String[] args) {
	      int[] nums = {0,7,15,42,100,305,999};
	      for (int n : nums)
	          System.out.println(n + " → " + toWords(n));
	      
	      
	      
	  }
	}