package Day04;

public class Patterns {

    static void printTriangle(int n) {
        
    	for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
				{	
					System.out.print("*");
				}
			System.out.println();
		}
    }
    static void printSquare(int n) {
        for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
				{	
					System.out.print("*");
				}
			System.out.println();
		}
    }
    static void printReverse(int n) {
        for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
				{	
					System.out.print("*");
				}
			System.out.println();
		}

    }

    public static void main(String[] args) {
        printTriangle(5);  
	System.out.println();
        printSquare(4);    
	System.out.println();
        printReverse(5);
    }
}
