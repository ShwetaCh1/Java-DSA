package linkedList;
import java.util.Scanner;
public class FixedIndex {


	
	    static int index = -1;
	    public static int find(int [] arr, int low , int high ){
	        if(high>= low){
	            int mid = (high + low)/2;
	            if(mid==0)
	            {
	                return -1;
	            }
	            if(mid == arr[mid] && mid !=0)
	            {
	                index = mid;
	                return  find(arr,low,mid-1);
	            }
	            if(mid>arr[mid]){
	                return find(arr, mid+1, high);
	            }
	            else{
	                return find(arr,low, mid-1);
	            }
	        }
	        return -1;
	    }
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int size = scan.nextInt();
	        int [] arr = new int[size+1];
	        for(int i=1; i<arr.length; i++) {
	            arr[i] = scan.nextInt();

	        }
	        int n = arr.length;
	        find(arr, 1, n-1);
	        if(index==-1) {
	        	System.out.println("NOT_FOUND");
	        }
	        else {
	      System.out.println("fixed point is " +index);
	    }
	}
}

