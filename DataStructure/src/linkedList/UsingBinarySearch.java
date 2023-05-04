package linkedList;

import java.util.Scanner;

public class UsingBinarySearch {
	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int arr[] = new int[size+1];
		for (int i = 0; i < size-1; i++) {
			arr[i] = scanner.nextInt();
		}
	   
		
	    int result = binarysearch(arr,size-1);
	    if(result!=-1)
	        System.out.println(result);
	    else
	        System.out.println("NOT_FOUND");
	}

	public static  int binarysearch(int[] array,int n){
	int start=1,end=n;
	while(start<=end){
	    int mid = (start+end)/2;
	    if(mid+1==array[mid])
	        return mid+1;
	    else  if(mid<array[mid-1])
	        end=mid-1;
	    else
	        start=mid+1;
	}
	return -1;
	}
}