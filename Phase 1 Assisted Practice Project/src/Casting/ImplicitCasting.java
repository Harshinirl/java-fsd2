package Casting;
import java.util.Scanner;
public class ImplicitCasting {
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a numbers : ");
		x=sc.nextInt();
		long y=x;
		float z=y;
		System.out.println("int value:" +x);
		System.out.println("long value:" +y);
		System.out.println("float value:" +z);
	}
}