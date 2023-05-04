package Heap;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  count=1;
int xf, avg, sum=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(count<=n) {
	xf=sc.nextInt();
	sum+=xf;
	++count;
}
avg=sum/n;
System.out.println(avg);
	}

}
