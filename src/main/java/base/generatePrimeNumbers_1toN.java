package base;

public class generatePrimeNumbers_1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 50; // You can change this value to generate primes up to a different number
		System.out.println("Prime numbers from 1 to " + N + " are:");
		for (int num = 2; num <= N; num++) {
			if (isPrime(num)) {
				System.out.print(num + " ");
			}
		}
		

	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
