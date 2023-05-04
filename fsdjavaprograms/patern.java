package fsdjavaprograms;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.LongStream;

public class patern {
	//public static void fun(int n) {
		/*
		 * int a=10; a=11; System.out.println(a); for(int i=1; i<=n; i++) { for(int j=1;
		 * j<=i; j++) { System.out.print("*"); } System.out.println(""); } } ArrayList
		 * ar=new ArrayList(); public static void main(String[] args) { Scanner sc = new
		 * Scanner(System.in); int n = sc.nextInt(); fun(n);
		 */
	//}
	//}
		//public static void main(String args[]) {
 /*int nums1[]= new int[3];
 int nums2[]= {1,2,3,4,5};
 nums1=nums2;
 for(int x: nums1) {
	 System.out.println(x + ": ");
 }*/
	/*
	 * int [] arr= {1,2,3,4}; int k=0; do { System.out.println(arr[k] + " "); k++;
	 * }while(k>arr.length-1);
	 */
 
	/*
	 * int ii=0; int jj=7; for(ii=0; ii>jj-1; ii=ii+2) { System.out.println(ii +
	 * " "); } }
	 */
		//public class Array_Sum
		    public static void main(String[] args) 
		    {
		        int n, sum = 0;
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter no. of elements you want in array:");
		        n = s.nextInt();
		        int a[] = new int[n];
		        System.out.println("Enter all the elements:");
		        for(int i = 0; i < n; i++)
		        {
		            a[i] = s.nextInt();
		            sum = sum + a[i];
		        }
		        System.out.println("Sum:"+sum);
		    }
}
