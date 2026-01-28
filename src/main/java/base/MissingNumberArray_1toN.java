package base;

public class MissingNumberArray_1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,5,6};
		int n = 6; // The range is from 1 to n
		int missingNumber = findMissingNumber(arr, n);
		System.out.println("The missing number is: " + missingNumber);
		

	}

	private static int findMissingNumber(int[] arr, int n) {
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;
		for (int num : arr) {
			actualSum += num;
		}
		return expectedSum - actualSum;
	}

}
