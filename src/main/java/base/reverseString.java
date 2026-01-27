package base;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World";
		String reversedStr = reverse(str);
		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + reversedStr);
		

	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		if (str == null || str.isEmpty()) {
			return str;
		}
		return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
		
	}

}
