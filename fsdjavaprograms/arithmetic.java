package fsdjavaprograms;

import java.util.Scanner;

public class arithmetic {
	
	
		 
		// Function to remove first and last
		// occurrence of a given character
		// from the given String
		static String removeOcc(String s, char ch)
		{
		    // Traverse the given String from
		    // the beginning
		    for (int i = 0; i < s.length(); i++)
		    {
		 
		        // If ch is found
		        if (s.charAt(i) == ch)
		        {
		            s = s.substring(0, i) +
		                s.substring(i + 1);
		            break;
		        }
		    }
		 
		    // Traverse the given String from
		    // the end
		    for (int i = s.length() - 1; i > -1; i--)
		    {
		 
		        // If ch is found
		        if (s.charAt(i) == ch)
		        {
		            s = s.substring(0, i) +
		                s.substring(i + 1);
		            break;
		        }
		    }
		    return s;
		}
		 
		// Driver Code
		public static void main(String[] args)
		{
		   Scanner sc=new Scanner(System.in);
		  String  s=sc.nextLine();
			//String s = "hello world";
		 
		    char ch = 'e';
		 
		    System.out.print(removeOcc(s, ch));
		}
		}
		 



