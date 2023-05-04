package StackDS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CompaireS1S2 {
	public static void main(String[] args) {
//Binarytree
	//https://ide.geeksforgeeks.org/online-java-compiler/d25b2cd6-451a-4e5a-bd73-05f1d44d168f8:25 pm 
	//node that dont have sibling
	//https://ide.geeksforgeeks.org/online-java-compiler/e5ba5056-db5e-4e2e-9457-28186441159a
	//median of a stream of am integer
	//https://ide.geeksforgeeks.org/online-java-compiler/12d69423-ad9f-4fbe-8b0d-2b8d37f6d68f
	//matrix smallest range
	//https://ide.geeksforgeeks.org/online-java-compiler/1eec33f8-eec9-48a9-8342-bc95efde830510:02 pm 
		//https://ide.geeksforgeeks.org/online-java-compiler/5c4c7ece-c198-40ae-a0c3-0611e31f2423
		//System.out.println(firstUniqChar("aabbccdde"));
	
	/*
	 * public static int firstUniqChar(String s) { if(s.length() == 0) return -1;
	 * int[] store = new int[26]; for(char ch : s.toCharArray()){ store[ch - 'a']++;
	 * } for(int idx = 0; idx < s.length(); idx++){ if(store[s.charAt(idx) - 'a'] ==
	 * 1){ return idx; } } return -1; }
	 */
		 Scanner in = new Scanner(System.in);

	        //storing the input string to String variable "str"
	        String str = in.nextLine();
		
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();

		/* This adds each character to 'h', while adding it does
		the following */
		for (int i = 0; i < str.length(); i++) {
		   char ch = str.charAt(i);

		   /* If the current character is not present in 'h', add
		    it to 'h' with the value as 1*/
		   if (h.containsKey(ch) == false) {
		       h.put(ch, 1);
		   }

		   /* Otherwise, increment the value of current character
		    in h*/
		   else {
		       h.put(ch, h.get(ch) + 1);
		   }
		}

		/* Now, traverse through the string from its first character
		and check which character has the value as 1 in h */
		for (int i = 0; i < str.length(); i++) {
		   char ch = str.charAt(i);
		   if (h.get(ch) == 1) {
		       System.out.println(ch);
		       break;
		   }
		}

	int  array[] =  {5, 8, 4, 4, 7, 6, 2, 6, 7, 3};
	int count = 0,n = array.length;

	   HashSet<Integer> hashSet = new HashSet<Integer>();
	 
	   for (int i = 0; i < n; i++)
	       hashSet.add(array[i]);

	   int currentElement = array[0];

	   while (hashSet.contains(currentElement) == true) {

	       count++;

	       currentElement--;
	   }

	   System.out.println(count);
}
}

