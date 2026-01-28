package base;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		rotate(arr, k);
		System.out.print("Rotated Array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		

	}

	private static void rotate(int[] arr, int k) {
		// TODO Auto-generated method stub
		if (arr == null || arr.length == 0) {
			return;
		}
		k = k % arr.length;
		reverse(arr, 0, arr.length - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);
		
		
	}

	private static void reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		
	}

}
