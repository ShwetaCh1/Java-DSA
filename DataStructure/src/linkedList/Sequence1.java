package linkedList;
import java.util.Scanner;
public class Sequence1 {

	/*
	 * public int fibonacci(int n) { if (n < 2) return n; else return (fibonacci(n -
	 * 1) + fibonacci(n - 2))%10; } public static int func(int n) { if (n == 1)
	 * return n; else return func(n-1); }
	 * 
	 * public static void main(String args[]) {
	 * System.out.println("Enter the fibonacci number to be generated : "); Scanner
	 * sc = new Scanner(System.in); int n = sc.nextInt(); Sequence1 sequence = new
	 * Sequence1(); int number = sequence.fibonacci(n);
	 * System.out.println("Fibonacci number:  " + number); }
	 */
    
    public static int func(int n) {
        if (n == 1)
            return n;
        else
            return func(n-1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive no: ");
        int n = sc.nextInt();
        int value = Sequence1.func(n);
        System.out.println(value);
    }
    
    //https://ide.geeksforgeeks.org/905941bf-26c7-4f5e-ac8b-ee24826be53d 
   // https://ide.geeksforgeeks.org/cedacb26-fbc1-472d-966a-cdac54e3dc3c
    //https://ide.geeksforgeeks.org/3fa33490-1a88-42ac-aa92-9f14c48077e1
}
