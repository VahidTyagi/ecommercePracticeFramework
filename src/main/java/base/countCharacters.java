package base;

public class countCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		int count = countCharacters(str);
		System.out.println("String: " + str);
		System.out.println("Number of characters: " + count);
		

	}

	private static int countCharacters(String str) {
		// TODO Auto-generated method stub
		if (str == null || str.isEmpty()) {
			return 0;
		}
		return 1 + countCharacters(str.substring(1));
		
		
	}

}
