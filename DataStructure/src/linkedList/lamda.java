package linkedList;

import java.util.HashMap;

public class lamda {
	public static void main(String args[]) {
//https://ide.geeksforgeeks.org/ef29ea57-04e6-4432-b042-1584be5cba8e
//https://ide.geeksforgeeks.org/bcc6bb5a-a7b8-4e43-9813-272cbe5a3add
	//https://ide.geeksforgeeks.org/98736578-502c-46da-bc26-78a381b776ff
	//https://ide.geeksforgeeks.org/3aeecebc-769c-444c-b351-4799a75443c7
		
			
			       HashMap<Character, Integer> h = new HashMap<Character, Integer>();
			       h.put('a', 3);
			       h.put('b', 2);
			       System.out.print(h.containsKey('a') + " ");
			       System.out.print(h.get('a') + " ");
			       h.remove('a');
			       System.out.print(h.containsKey('a') + " ");
			       h.clear();
			       System.out.print(h.isEmpty() + " ");
			   }	 
}
