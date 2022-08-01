package Collections;
import java.util.*;  
public class LinkedHashset {
	public static void main(String args[]){ 
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Gobika");  
		set.add("Eswari");  
		set.add("Ravi");  
		set.add("Archana");
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){
			System.out.println(itr.next());  
		} 
	}
}