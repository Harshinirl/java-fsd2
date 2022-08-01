package Casting;
import java.util.Scanner;
public class ExplicitCasting {
	public static void main(String[] args) {
		double a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numbers : ");
		a=sc.nextDouble();
		long b=(long) a;
		int c=(int) b;
		System.out.println("double value:" +a);
		System.out.println("long value:" +b);
		System.out.println("int value:" +c);
		

	}

}