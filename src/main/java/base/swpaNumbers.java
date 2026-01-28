package base;

public class swpaNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12345;
		int reversedNumber = 0;
			
		while (number != 0) {
		    int digit = number % 10;
		    reversedNumber = reversedNumber * 10 + digit;
		    number /= 10;
		}
		System.out.println("Reversed Number: " + reversedNumber);
		

	}

}
