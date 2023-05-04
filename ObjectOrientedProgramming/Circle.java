package ObjectOrientedProgramming;

import java.io.Console;

public class Circle {

	

	public String area() {
		return null;
		// TODO Auto-generated method stub
		
	}
	 public static class superclass
	    {
	        static void print()
	        {
	            System.out.println("superclass.");
	        }
	    }
	    public static class subclass extends superclass
	    {
	        static void print()
	        {
	            System.out.println("subclass.");
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        superclass A = new superclass();
	        superclass B = new subclass();
	        A.print();
	        B.print();
	    }

}
