package linkedList;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class duplicates {
public void  findDuplicates(int[] id) {
	for(int i=0; i<id.length; i++) {
		for (int j=i+1; j<id.length; j++) {
			if(id[i]==id[j]) {
				System.out.println(id[i]+ " ");
			}
		}
	}
}

public void  findDuplicates2(int[] id) {
	int count []=new int[1000];
	for(int i=0; i<id.length; i++) {
		count [id[i]]++;
		if(count[id[i]]==2)
				System.out.print(count[id[i]]+ "  "+ id[i]+ " ");
		
			}
	System.out.println(" ");
		}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int id[]=getInput(n);
		System.out.println("student id"+ " ");
		printID(id);
		duplicates duplicate= new duplicates();
		duplicate.findDuplicates2(id);
	}
	private static void printID(int[] id) {
		for(int i=0; i<id.length; i++) {
			System.out.print(id[i]+ " ");
		}
		System.out.println( " ");
	}
	private static int[] getInput(int n) {
		int input[]= new int[n];
		for(int i=0; i<n; i++) {
			input [i]=randomNumber(1, 2*n);
		}
		return input;
	}
	private static int randomNumber(int min , int max) {
		int randomNumber=ThreadLocalRandom.current().nextInt(min, max+1);
		
		return randomNumber;
	}

}
