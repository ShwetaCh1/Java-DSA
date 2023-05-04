package linkedList;

public class FindMidIndexValue {

	static int binarySearch(int arr[], int m) {

		int start=0; 
		int end=arr.length-1; 
	while(start<=end) {
			int  mid=start+end/2;
			if(mid==arr[mid+1]) {
				return mid; 
			} 
			if(mid>=arr[mid]) {
				start=mid+1;
			} 
			if(mid<=arr[mid]) { 
				end=mid-1; 
			} 
			
			}


		return -1; 

	}

	public static void main(String[] args) {
		
		int arr[] = {0, 1,3,4,5};
     int n=arr.length;
		 binarySearch(arr,  n-1);	
		/*int result=binarySearch(arr,  n-1);
		if(result==arr[n+1]) {
			System.out.println(result);
		}*/
		//else System.out.println("NOT_FOUND");
		System.out.println( binarySearch(arr,  n-1 ));	
	}
}
