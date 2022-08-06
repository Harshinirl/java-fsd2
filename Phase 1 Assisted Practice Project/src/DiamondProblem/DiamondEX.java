package DiamondProblem;
interface Interface1{  
	public default void display() {
	System.out.println("Interface1");
	}
}
interface Interface2{  
	public default void display() {
    System.out.println("Interface2");
	}
}
public class DiamondEX implements Interface1, Interface2{
	public void display() {
		Interface1.super.display();	      
	    Interface2.super.display();
	}
    public static void main(String args[]) {
    	DiamondEX obj = new DiamondEX();
    	obj.display();
    }
   
}
