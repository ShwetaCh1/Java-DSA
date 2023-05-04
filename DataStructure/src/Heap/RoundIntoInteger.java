package Heap;

import java.util.Scanner;

public class RoundIntoInteger {

	public static void main(String[] args) {
		double[] array= {10.32, 20.36, 30.50, 40.51, 50.49, 60.43, 71.49};
		for(int i=0; i<array.length; i++) {
			array[i]=(int)Math.round(array[i]);
		}
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]+" ");
		}
       }
	

}
