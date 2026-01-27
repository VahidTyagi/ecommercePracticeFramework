package base;

public class nonRepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "swiss";
		char result = firstNonRepeatedCharacter(str);
		if (result != '\0') {
			System.out.println("First non-repeated character: " + result);
		} else {
			System.out.println("All characters are repeated.");
		}
		

	}

	private static char firstNonRepeatedCharacter(String str) {
		// TODO Auto-generated method stub
		int[] charCount = new int[256]; // Assuming ASCII character set
		
		// Count occurrences of each character
		for (int i = 0; i < str.length(); i++) {
			charCount[str.charAt(i)]++;
		}
		
		// Find the first non-repeated character
		for (int i = 0; i < str.length(); i++) {
			if (charCount[str.charAt(i)] == 1) {
				return str.charAt(i);
			}
		}
		
		return '\0'; // Return null character if all are repeated
	}

}
