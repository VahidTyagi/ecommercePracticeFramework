package base;

public class anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "listen";
		String str2 = "silent";
		boolean result = areAnagrams(str1, str2);
		if (result) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
		

	}

	private static boolean areAnagrams(String str1, String str2) {
		// TODO Auto-generated method stub
		if (str1.length() != str2.length()) {
			return false;
		}
		int[] charCount = new int[256]; // Assuming ASCII character set
		for (int i = 0; i < str1.length(); i++) {
			charCount[str1.charAt(i)]++;
			charCount[str2.charAt(i)]--;
		}
		for (int count : charCount) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}

}
