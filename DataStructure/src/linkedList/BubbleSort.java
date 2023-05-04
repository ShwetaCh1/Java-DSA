package linkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class BubbleSort {


	 
	 static int totalBubbleSortSwaps(int[] array, int M) {
	       int size = array.length;
	       //int var = 0;
	       int totalSwaps = 0;
	       //Write your code here
	       for(int i=0; i<M; i++){
	           for(int j=1; j<size-i; j++){
	               if(array[j-1]>array[j])
	               swap(j-1, j, array);
	                  totalSwaps++;
	           }
	          
	       }
	       return totalSwaps;
	   }
	   public static void swap(int i, int j, int[] arr){
	       int temp= arr[j-1];
	       arr[j-1]=arr[j];
	       arr[j]=temp;
	    
	   }
	   public static void main (String [] args){
		   HashMap<String, String> map= new HashMap<String, String>();
		  
		   map.put("shweta", "ch");
		   map.put("shweta", "cha");
		   map.put("abc", "xyz");
		   map.put("hi", "hello");
		   System.out.println(map.get("ch"));
		   //System.out.println(map.remove("shweta"));
		   System.out.println(map.toString().charAt(2));
	       Scanner scanner = new Scanner(System.in);
	            int m = scanner.nextInt();
	            int size = scanner.nextInt();
	            int array[] = new int[size];
	            for (int i = 0; i < size; i++) {
	                array[i] = scanner.nextInt();
	            }
	            System.out.println(totalBubbleSortSwaps(array, m));
	            
	           
	      
	   }
	}


