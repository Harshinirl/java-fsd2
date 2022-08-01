package Collections;
import java.util.*;  
public class Hashset {
	public static void main(String args[]){  
		HashSet<Integer> set=new HashSet<Integer>();     
		set.add(107);  
		set.add(235);  
		set.add(816);  
		set.add(1912);  
		Iterator<Integer> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}
}