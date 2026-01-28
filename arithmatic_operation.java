package CodeOne;
import java.util.Scanner;

public class arithmatic_operation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		
		int c = a+b;
		System.out.println("a+b ="+c);
		int D = a-b;
		System.out.println("a-b ="+D);
		int e = a*b;
		System.out.println("a*b ="+e);
		int f = a/b;
		System.out.println("a/b ="+f);
	}
}
