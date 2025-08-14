package Day2;

public class Operators {
	    public static void main(String[] args) {
	        int a = 10, b = 5;

	        // Arithmetic operator (Addition)
	        System.out.println("Arithmetic (a + b): " + (a + b));

	        // Relational operator (Greater than)
	        System.out.println("Relational (a > b): " + (a > b));

	        // Logical operator (AND)
	        boolean x = true, y = false;
	        System.out.println("Logical (x && y): " + (x && y));

	        // Assignment operator
	        int c = a; 
	        System.out.println("Assignment (c = a): " + c);

	        // Increment/Decrement operator
	        a++; 
	        System.out.println("Increment (a++): " + a);

	        // Ternary operator
	        int max = (a > b) ? a : b;
	        System.out.println("Ternary (max of a and b): " + max);

	    }
	}
