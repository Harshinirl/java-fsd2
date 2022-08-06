package SearchAlgo;
public class LinearSearch {
	public static void main(String args[]){
	      int array[] = {10, 16, 24, 6, 9, 35};
	      int n = array.length;
	      int value = 6;
          for (int i=0 ;i< n-1; i++){
	         if(array[i]==value){
	            System.out.println("Element found index is :"+ i);
	         }
	      }
	}
}
