package unit1;
import java.util.Arrays;
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
		//obj.findTheDuplicateElements(arr);
		//obj.findSecondLargestAndSecondSmallestElement(array);
		//obj.leftRotationInAnArray(array);
		//obj.removeElementInArray(array); // (Optional)

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
		
	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		// write code here!

	}

	void leftRotationInAnArray(int[] arr) {
		// write code here!

	}

	void removeElementInArray(int[] arr) {
		// write code here!

	}

}
