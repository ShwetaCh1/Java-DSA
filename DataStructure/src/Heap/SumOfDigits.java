package Heap;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
int [] arr=new int[n];
for(int i=0; i<n; i++) {
	arr[i]=sc.nextInt();
}
int maxSumIndex=0;
int maxDigitSum=0;
for(int i=0; i<n; i++) {
	int digitSum= getDigitSum(arr[i]);
	if(digitSum>maxDigitSum) {
		maxDigitSum=digitSum;
		maxSumIndex=1;
	}
		
}
System.out.println(maxSumIndex);
	}

	public  static int getDigitSum(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}

}
