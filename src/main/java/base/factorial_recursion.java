package base;

public class factorial_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5; // Example number to calculate factorial
		int result = factorial(number);
		System.out.println("Factorial of " + number + " is: " + result);
		
		

	}

	private static int factorial(int number) {
		if (number == 0) {
			return 1; // Base case: factorial of 0 is 1
		} else {
			return number * factorial(number - 1); // Recursive case
		}
		
	}

}
