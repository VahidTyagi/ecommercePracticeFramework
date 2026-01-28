package base;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int number = 5;
			int result = factorial(number);
			System.out.println("Factorial of " + number + " is: " + result);
			
			

	}

	private static int factorial(int number) {
		// TODO Auto-generated method stub
		if (number == 0) {
			return 1;
		}
		return number * factorial(number - 1);
	}

}
