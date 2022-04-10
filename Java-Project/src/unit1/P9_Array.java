package unit1;
import java.util.Arrays;
import java.util.Scanner;
/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {
        //int[] arr = new int[9];
		int[] arr = {1,2,3,4,5,4,6,2,3};

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(arr);
		obj.findTheDuplicateElements(arr);
		obj.findSecondLargestAndSecondSmallestElement(arr);
		obj.leftRotationInAnArray(arr);
		obj.removeElementInArray(arr); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	void findTheDuplicateElements(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate element found :"+arr[j]);
				}
			}
		}
	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array(Minimum 2):");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:"+a[n-2]);
        System.out.println("Smallest:"+a[0]);
	}

	void leftRotationInAnArray(int[] arr) {
		int n=3;
		//Displays the original array
		System.out.println("Original Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		//Rotate the given array by n times forward left
		for(int i=0;i<n;i++) {
			int j,first;
			//Stores the first element of the array
			first = arr[0];
			for(j=0;j<arr.length-1;j++) {
				//Shifting element of array by one
				arr[j] = arr[j+1];
			}//First element of array will be added to the end
			arr[j] = first;
		}
		System.out.println();
		//Displays the resulting array after rotation
		System.out.println("Array after left rotation");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	void removeElementInArray(int[] arr) {
		// write code here!

	}

}