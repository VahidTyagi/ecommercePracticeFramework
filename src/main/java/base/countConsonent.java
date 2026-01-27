package base;

public class countConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		int count = countConsonants(str);
		System.out.println("String: " + str);
		System.out.println("Number of consonants: " + count);
		
		

	}

	private static int countConsonants(String str) {
		// TODO Auto-generated method stub
		if (str == null || str.isEmpty()) {
			return 0;
		}
		char firstChar = str.charAt(0);
		int count = 0;
		if (isConsonant(firstChar)) {
			count = 1;
		}
		return count + countConsonants(str.substring(1));
	}

	private static boolean isConsonant(char firstChar) {
		// TODO Auto-generated method stub
		return false;
	}

}
