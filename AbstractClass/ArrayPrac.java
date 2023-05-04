package AbstractClass;

import java.util.Arrays;

public class ArrayPrac {

 public static void main(String[] args) {

 int[] arr = {23, 4, 6, 78, 90, 12, 43, 11, 9, 8, 79, 32, 47};
 int key = 47;


 Arrays.sort(arr);
 for(int i = 0; i < arr.length; i++) {
 if(arr[i] == key) {
 System.out.println("key is found at " + i);
 break;
 }
 }
 doBinarySearch(arr, 0, arr.length-1, key);
 }

 private static void doBinarySearch(int[] arr, int i, int j, int key) {
	// TODO Auto-generated method stub
	
}

public static void doBinarySearch(int first, int i, int last, int key) {
int mid = (first + last)/2;
 boolean isFound = false;
 while(first <= last) {
 int[] arr = null;
if(arr[mid] < key) {
 first = mid +1;
 } else if(arr[mid] == key) {
 System.out.println("we found at : " + mid);
 isFound = true;
 break;
 } else {
 last = mid - 1;
 }
 mid = (first + last)/2;
 }
 if(!isFound) {
 System.out.println("element not found");
 }

 }
}

