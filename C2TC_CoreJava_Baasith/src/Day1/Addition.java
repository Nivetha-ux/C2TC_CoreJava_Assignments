package Day1;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a+b;
		System.out.print(c);
		
		sc.close();
	}
}