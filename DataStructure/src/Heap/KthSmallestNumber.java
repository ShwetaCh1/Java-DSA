package Heap;
import java.util.*;
public class KthSmallestNumber {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	       int  k = sc.nextInt();

	        int stream[] = new int[n];

	        for (int i = 0; i < n; i++) {

	            stream[i] = sc.nextInt();

	        }

	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	        while(!pq.isEmpty())
	        {
	            System.out.print("None");
	        }
	        for(int i=0;i<stream.length;i++)
	        {
	            pq.add(stream[i]);
	            if(pq.size() >k )
	            {
	                pq.poll();
	            }
	           
	        }
	        for(int v:pq) {
	        System.out.println( k+" "+ "largest number is "+ v);
	        }
	       
	       System.out.println();
	        }

	       public static void print(int arr[])
	        {
	            for(int i=0;i<arr.length;i++)
	            {
	                System.out.println(arr[i]);
	            }
	    }
}


