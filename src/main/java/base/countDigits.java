package base;

public class countDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123456789;
		int count = countDigits(number);
		System.out.println("Number: " + number);
		System.out.println("Number of digits: " + count);
		

	}

	private static int countDigits(int number) {
		// TODO Auto-generated method stub
		if (number == 0) {
			return 0;
		}
		return 1 + countDigits(number / 10);
		
	}

}
