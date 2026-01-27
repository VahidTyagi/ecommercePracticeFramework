package base;

public class palindromeString_and_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		int num = 121;
		System.out.println("Is the string \"" + str + "\" a palindrome? " + isPalindromeString(str));
		System.out.println("Is the number " + num + " a palindrome? " + isPalindromeNumber(num));
		

	}

	private static String isPalindromeNumber(int num) {
		// TODO Auto-generated method stub
		String strNum = Integer.toString(num);
		String reversedStrNum = new StringBuilder(strNum).reverse().toString();
		return strNum.equals(reversedStrNum) ? "Yes" : "No";
	}

	private static String isPalindromeString(String str) {
		// TODO Auto-generated method stub
		String reversedStr = new StringBuilder(str).reverse().toString();
		return str.equals(reversedStr) ? "Yes" : "No";
	}

}
