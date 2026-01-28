package base;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; // Number of terms in the Fibonacci series
		System.out.println("Fibonacci Series up to " + n + " terms:");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		
		

	}

	private static String fibonacci(int i) {
		// TODO Auto-generated method stub
		if (i <= 0) {
			return "0";
		} else if (i == 1) {
			return "1";
		} else {
			return String.valueOf(Integer.parseInt(fibonacci(i - 1)) + Integer.parseInt(fibonacci(i - 2)));
		}
	}

}
