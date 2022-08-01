package ImpMethod;
public class MethodOverloading {
	static int mul(int x, int y)   
		{  
		return x * y;  
		}  
		static double mul(double x, double y)   
		{  
		return x * y;  
		}  
		public static void main(String[] args)   
		{  
		int a = mul(6,7);  
		double b = mul(10,1);  
		System.out.println("mul of integer values: " +a);  
		System.out.println("mul of double values: " +b);  
		}  
}
