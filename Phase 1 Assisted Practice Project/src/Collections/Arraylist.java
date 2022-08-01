package Collections;
import java.util.*;
public class Arraylist {
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	    list.add("Akshaya");//Adding object in arraylist  
	    list.add("Kabil");  
	    list.add("Lura");  
	    list.add("Shyam");  
	    Iterator itr=list.iterator();  
	    while(itr.hasNext()){
	    	System.out.println(itr.next());  
	    }
	}
}