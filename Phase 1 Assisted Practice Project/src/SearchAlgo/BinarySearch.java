package SearchAlgo;
public class BinarySearch {
	public static void main(String[] args) {
		int array[] = {3, 16, 24, 10, 15, 9};
	      int n = array.length;
	      int low = 0;
	      int high = n-1;
	      int val = 16;
	      int mid = 0;
	      mid = low +(high-low)/2;
	      while(low<=high){
	         if(array[mid] == val){
	            System.out.println("The value is: "+mid);
	            break;
	         }
	         else if(array[mid]<val) {
	         low = mid+1;
	         }
	         else {
	        	 high = mid - 1;
	         }
	         mid = (low+high)/2;
	      }
	}
}
