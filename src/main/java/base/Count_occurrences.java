package base;

public class Count_occurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello World";
		char ch = 'o';
		int count = countOccurrences(str, ch);
		System.out.println("The character '" + ch + "' occurs " + count + " times in the string: " + str);
		
	}

	private static int countOccurrences(String str, char ch) {
		// TODO Auto-generated method stub
		if (str == null || str.isEmpty()) {
			return 0;
		}
		int count = (str.charAt(0) == ch) ? 1 : 0;
		return count + countOccurrences(str.substring(1), ch);
	}

}
