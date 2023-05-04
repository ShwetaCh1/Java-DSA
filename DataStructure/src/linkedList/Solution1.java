package linkedList;
import java.util.Arrays;
import java.util.Scanner;
//public class addTwoSortedArrays {
	/*
	 * public static int[] mergeArray(int[] sortedArray1, int[] sortedArray2) {
	 * int[] mergedArray = new int[sortedArray1.length + sortedArray2.length]; int
	 * i=0, j=0, k=0; while (i <sortedArray1.length && j < sortedArray2.length) { if
	 * (sortedArray1[i] < sortedArray2[j]) { mergedArray[k] = sortedArray1[i]; i++;
	 * k++; } else { mergedArray[k] = sortedArray2[j]; j++; k++; } } while (i <
	 * sortedArray1.length) { mergedArray[k] = sortedArray1[i]; i++; k++; } while (j
	 * < sortedArray2.length) { mergedArray[k] = sortedArray2[j]; j++; k++; } return
	 * mergedArray; } public static void main(String[] args) { Scanner scanner = new
	 * Scanner(System.in); int sizeArray1 = scanner.nextInt(); int sizeArray2 =
	 * scanner.nextInt(); int sortedArray1[] = getArrayInput(sizeArray1, scanner);
	 * int sortedArray2[] = getArrayInput(sizeArray2, scanner); int[] mergedArray =
	 * mergeArray(sortedArray1, sortedArray2);
	 * System.out.println("sortedArray1 : "+Arrays.toString(sortedArray1));
	 * 
	 * System.out.println("sortedArray2 : "+Arrays.toString(sortedArray2));
	 * System.out.println("Merged Array : "+Arrays.toString(mergedArray )); } public
	 * static int[] getArrayInput(int n, Scanner scanner) { int [] arr = new int[n];
	 * for(int i=0; i<n; i++) { arr[i]=scanner.nextInt(); } return arr; }
	 */
	
class Find_First_Positive {
    void search_Element(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {

            // Checking weather key is present or not in the given array
            if (arr[i] == i && arr[i]>0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(" NOT_FOUND ");
    }
}

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the size of array from user
        int size = sc.nextInt();
        int arr[] = new int[size + 1];

        // Taking the element of array from user
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Find_First_Positive search = new Find_First_Positive();
        search.search_Element(arr);
    }
}

