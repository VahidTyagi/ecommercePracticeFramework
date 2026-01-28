package base;

public class removeDuplicate_array_arraylis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 2, 4, 1, 5, 3};
		int[] result = removeDuplicates(arr);
		System.out.print("Array after removing duplicates: ");
		for (int num : result) {
			System.out.print(num + " ");
		}
		
		

	}

	private static int[] removeDuplicates(int[] arr) {
		java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
		for (int num : arr) {
			if (!list.contains(num)) {
				list.add(num);
			}
		}
		// Convert ArrayList back to array
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

}
