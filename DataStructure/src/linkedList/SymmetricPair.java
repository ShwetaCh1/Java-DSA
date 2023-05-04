package linkedList;

import java.util.HashMap;

public class SymmetricPair {

		 public static void main(String[] args) {

		 int[][] arr = {
		 {1,2}, {2,3}, {3,4}, {4,3}, {2,1}
		 };
		//(a,b) and (c, d) --> a == d and b == c
		 HashMap<Integer, Integer> hashMap = new HashMap<>();
		 for(int i = 0; i < arr.length; i++) {


		 int a = arr[i][0]; //2
		 int b = arr[i][1]; //1
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println("------");
		if(hashMap.containsKey(b)) {
		 int d = hashMap.get(b);
		 if(d == a){
		 System.out.println("Pair found :" + "("+a+","+b+") -> " + "("+b+","+a+")");
		 }
		 }
		 hashMap.put(a, b);

		 }
		 //(1->2),(2->3),(3->4), (4->3),


		 }
		
		//https://docs.google.com/presentation/d/1fwjtiHEMK6XTICWmdgfvu6gmVZH0NRyI/edit?usp=sharing&ouid=105787568810622731707&rtpof=true&sd=true9:43 pm  
}
