package linkedList;

public class PrintIndex {
	 static int binarySearch(int arr[], int low, int high) 
	    { 
		 
	        if(high >= low) 
	        {    
	            /* low + (high - low)/2; */
	            int mid = (low + high)/2;   
	            if(mid == arr[mid]) 
	                return mid; 
	            if(mid > arr[mid]) 
	                return binarySearch(arr, (mid + 1), high); 
	            else
	                return binarySearch(arr, low, (mid -1)); 
	        } 
	        
	        /* Return -1 if there is  
	           no Fixed Point */
	        return -1; 
	    } 
	        
	    //main function 
	    public static void main(String args[]) 
	    { 
	        int arr[] = {0, 1,3,4,5};
	        
	        int n = arr.length; 
	        System.out.println("Fixed Point is " 
	                   + binarySearch(arr,0, n-1));         
	    }  
	} 
	

