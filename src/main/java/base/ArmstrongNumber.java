package base;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num = 153;
			boolean result = isArmstrong(num);
			if (result) {
				System.out.println(num + " is an Armstrong number.");
			} else {
				System.out.println(num + " is not an Armstrong number.");
			}
			

	}

	private static boolean isArmstrong(int num) {
		int originalNum = num;
		int sum = 0;
		int digits = String.valueOf(num).length();
		
		while (num != 0) {
			int digit = num % 10;
			sum += Math.pow(digit, digits);
			num /= 10;
		}
		
		return sum == originalNum;
	}

}
