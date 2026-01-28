package CodeOne;
import java.util.Scanner;


public class swap_numbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number");
		int a = sc.nextInt();
		
		System.out.println("enter the second number");
		int b= sc.nextInt();
		
		System.out.println("Before Swap");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("After Swap ");
		int temp = a;
		a=b;
		b = temp;
		System.out.println("a="+a);
		System.out.println("B="+b);
		
	}
}
