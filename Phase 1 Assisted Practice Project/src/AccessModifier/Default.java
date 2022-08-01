package AccessModifier;
class Default {
	  void display() {
	         System.out.println("Welcome All"); 
	  }
	  public class Default1 {
			public void main(String[] args) {
					System.out.println("Hello");
					Default obj = new Default(); 		  
			        obj.display(); 
			}
	  }
}