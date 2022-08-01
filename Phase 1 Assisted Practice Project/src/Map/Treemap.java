package Map;
import java.util.*; 
public class Treemap { 
	public static void main(String args[]){  
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Suriya");    
	      map.put(102,"Ajith");    
	      map.put(101,"Vijay");    
	      map.put(103,"Karthi");    
	      for(Map.Entry m:map.entrySet()){    
	    	  System.out.println(m.getKey()+" "+m.getValue());    
	      }
	}
}