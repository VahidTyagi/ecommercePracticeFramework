package base;

public class mergedString_arrays {

	public static void main(String[] args) {

		String[] array1 = {"Hello", "World"};
		String[] array2 = {"Welcome", "to", "Java"};
		
		String[] mergedArray = mergeArrays(array1, array2);
		
		System.out.println("Merged Array:");
		for (String str : mergedArray) {
			System.out.print(str + " ");
		}
		
		

	}

	private static String[] mergeArrays(String[] array1, String[] array2) {
		String[] mergedArray = new String[array1.length + array2.length];
		
		int index = 0;
		for (String str : array1) {
			mergedArray[index++] = str;
		}
		for (String str : array2) {
			mergedArray[index++] = str;
		}
		
		return mergedArray;
	}

}
