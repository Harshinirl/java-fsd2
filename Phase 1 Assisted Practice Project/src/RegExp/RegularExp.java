package RegExp;
import java.util.regex.*;    
import java.util.*; 
public class RegularExp { 
	public static void main(String args[]){  
		ArrayList<String> emails = new ArrayList<String>();     
		emails.add("harshini@gmail.com"); 
		emails.add("@yahoo.com");  
	    emails.add("harshini#gmail.com");    
	    String regex = "^(.+)@(.+)$";   
	    Pattern pattern = Pattern.compile(regex);    
		for(String email : emails){  
	    Matcher matcher = pattern.matcher(email);  
		System.out.println(email +" : "+ matcher.matches()+"\n"); 
		}
	}
}