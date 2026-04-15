package Day09;

public class Calculator {
    static double calculate(double a, String op, double b) {
        switch (op) {
            case "+": // TODO: return addition
            	return a+b;
            case "-": // TODO: return subtraction
            	return a-b;
            case "*": // TODO: return multiplication
            	return a*b;
            case "/": 
            	return b == 0 ? Double.NaN : a / b;
            case "%":
            	return a%b;
            default:  return Double.NaN;
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate(10, "+", 5));
        System.out.println(calculate(10, "-", 3));
        System.out.println(calculate( 6, "*", 7));
        System.out.println(calculate(15, "/", 4));
        System.out.println(calculate( 9, "/", 0));
        System.out.println(calculate(10, "%", 3));
    }
}