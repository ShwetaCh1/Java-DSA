package upgradeAssignment;
import java.util.Scanner;
public class SolutionB {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int key = scanner.nextInt();
		int array[] = new int[size];
		for (int i = 1; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		binarySearch(array, key);
	}
	public static int binarySearch(int arr[], int key)throws Exception {
		int start=0;
		int i=0;
		int sum=0;
		while(true) {
			try {
				sum+=arr[i];
			}catch (ArrayIndexOutOfBoundsException e) {
				break;
			}
			i++;
		}
		int end=i-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==key) {
				System.out.println(mid);
				break;
			}
			else if(arr[mid]<key) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			mid=(start+end)/2;
		}
		if(start>end) {
			System.out.println("NOT_FOUND");
		}
		return key;

	}

}


