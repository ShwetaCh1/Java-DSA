package StackDS;
import java.util.*;
public class FifthElementFromTop {
	

	
	/*
	 * public static void main(String args[]) { Stack<Integer> stack = new
	 * Stack<>(); Scanner s = new Scanner(System.in); int n = s.nextInt(); while
	 * (n-- > 0) stack.push(s.nextInt()); printFifthElementFromEnd(stack); }
	 * 
	 * // Method to print the fifth element from the top of the stack static void
	 * printFifthElementFromEnd(Stack<Integer> stack) { int n = stack.size(); // If
	 * the stack doesn't have enough elements if (n < 5)
	 * System.out.println("There are not enough elements in the stack"); else { for
	 * (int i = 0; i <4; i++){ stack.pop(); } System.out.println( stack.peek()); } }
	 * }
	 */
//To find the geight of the binary tree
//https://ide.geeksforgeeks.org/a30a467d-f879-4839-96d5-1b0be78a10538:45 pm 
//lavelOrderTranseverse
//https://ide.geeksforgeeks.org/8c463bc0-ab24-4924-ac25-fc8c139146b09:09 pm 

//using queue
//https://ide.geeksforgeeks.org/0a10aa43-83db-4dec-b0cb-52ac33e9c2fc9:27 pm 
//print the value in next line
//https://ide.geeksforgeeks.org/ed1b8d0b-00f5-4371-aa82-e1a50e293b6e9:42 pm
//using HasMap
//https://ide.geeksforgeeks.org/88622123-a090-4243-a101-97e9dca997c29:59 pm 
//ArrayBST
//https://ide.geeksforgeeks.org/online-java-compiler/4be76fe9-a9b9-4507-9207-a82e5c8ca49c8:38 pm 
//Lowest common anscestor
//https://ide.geeksforgeeks.org/online-java-compiler/ba6573fb-5a2c-4705-a660-0a3a0c54ad7d8:59 pm 
//priority queue
//https://ide.geeksforgeeks.org/online-java-compiler/62a23102-a111-466a-bbd6-f1077a7052819:29 pm
//https://ide.geeksforgeeks.org/online-java-compiler/7b0568b3-d522-42b8-8764-36e94204a8539:35 pm 
//override compaire mathod
//https://ide.geeksforgeeks.org/online-java-compiler/ec647f62-c007-4b7b-8c10-aa5e6535a8d39:38 pm 
//https://ide.geeksforgeeks.org/online-java-compiler/7f2385db-0417-4e5e-88d4-f09d0a1450b39:45 pm 

//priority queue ADT
//https://ide.geeksforgeeks.org/online-java-compiler/3dd9170f-b907-42b8-abb4-5d82797767d59:53 pm 
//sort the queue
//https://ide.geeksforgeeks.org/online-java-compiler/6eb4f0b9-cbb3-4238-bdd1-72375597d02a
//priorityQUEUE
//https://ide.geeksforgeeks.org/online-java-compiler/c3396244-f537-43e4-95cd-c90d072980969:51 pm
//https://ide.geeksforgeeks.org/online-java-compiler/22724175-5141-4a4a-8234-4ecad5b020c99:53 pm 

//heap
//https://ide.geeksforgeeks.org/online-java-compiler/ce465109-5937-4e6f-9922-f1b93052980e

//https://ide.geeksforgeeks.org/online-java-compiler/96e20ffd-5cd6-4df6-b641-fedb407313099:00 pm


//graph
public static void main(String[] args)
{
   String str, word;
   int wordsLen, i, count, j, k;
   Scanner s = new Scanner(System.in);
   
   System.out.print("Enter the String: ");
   str = s.nextLine();
   
   String words[] = str.split(" ");
   wordsLen = words.length;
   
  // System.out.println("\n----Occurrences of Each Word----");
   for(i=0; i<wordsLen; i++)
   {
      word = words[i];
      count = 1;
      for(j=(i+1); j<(wordsLen-1); j++)
      {
         if(word.equals(words[j]))
         {
            count++;
            for(k=j; k<(wordsLen-1); k++)
            {
               words[k] = words[k+1];
            }
            wordsLen--;
            j--;
         }
      }
      System.out.println(word+" "+count);
      count = 0;
   }
}
}
