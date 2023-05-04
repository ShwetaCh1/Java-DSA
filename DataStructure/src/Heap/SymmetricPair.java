package Heap;

import java.util.Scanner;

public class SymmetricPair {
	

	    public static void symmetricPair(int[][] arr) {
	        // Write code here
	        int row = arr.length;
	        int col = arr[0].length;
	        System.out.println(row+" "+col);
	        for(int i=0;i< row ;i++)   //  i =0 
	        {
	            for(int j=i+1;j<row;j++) // j =1
	            {
	                if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0])  // 00 == 11  && 01 == 10
	                {
	                    System.out.println(arr[i][0] + " "+arr[i][1]);
	                }
	            }
	        }
	    }

	    public static void main(String arg[]) {
	        Scanner sc = new Scanner(System.in);
	        int row = sc.nextInt();
	        int arr[][] = new int[row][2];
	        for(int i = 0 ; i < row ; i++){
	            for(int j = 0 ; j < 2 ; j++){   // 0 0   -> 0 1      10 11    20 21   3031 
	                arr[i][j] = sc.nextInt();
	            }
	        }
	        symmetricPair(arr);
	    }
	}
