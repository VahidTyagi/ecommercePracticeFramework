package base;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 2, 5, 3, 6, 1};
		System.out.println("Duplicate elements in the array:");
		findDuplicates(array);
		

	}

	private static void findDuplicates(int[] array) {
		boolean[] visited = new boolean[array.length];
		
		for (int i = 0; i < array.length; i++) {
			if (visited[i]) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					visited[j] = true;
				}
			}
			if (count > 1) {
				System.out.println(array[i] + " appears " + count + " times.");
			}
		}
		
		
		
	}

}
