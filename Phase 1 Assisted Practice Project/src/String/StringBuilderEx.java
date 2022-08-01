package String;
public class StringBuilderEx {
	public static void main(String args[]){ 
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.insert(1,"All");//now original string is changed  
		System.out.println(sb); 
		}  
}