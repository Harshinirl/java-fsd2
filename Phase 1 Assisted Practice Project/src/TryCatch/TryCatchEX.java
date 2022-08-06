package TryCatch;
public class TryCatchEX {
	public static void main(String[] args) {
		int a;
		try {
			
			a= 16/0;
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println("error occured");
			
		}
	}
}
