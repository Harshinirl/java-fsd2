package Innerclass;
class InnerDemo{
	int num;
    private class Inner_Demo {
    	public void print() {
    		System.out.println("This is an Inner Class");
    	}
    }
    void display_Inner() {
    	Inner_Demo inner = new Inner_Demo();
		inner.print();
    }
}
public class MyClass {
	public static void main(String args[]) {
		// Instantiating the outer class 
		InnerDemo outer = new InnerDemo();
	   // Accessing the display_Inner() method.
		outer.display_Inner();
	}
}