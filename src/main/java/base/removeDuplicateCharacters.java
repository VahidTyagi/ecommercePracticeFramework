package base;

public class removeDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
		String result = removeDuplicates(str);
		System.out.println("Original String: " + str);
		System.out.println("String after removing duplicates: " + result);
		

	}

	private static String removeDuplicates(String str) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (sb.indexOf(String.valueOf(c)) == -1) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
