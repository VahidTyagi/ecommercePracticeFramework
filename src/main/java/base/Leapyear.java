package base;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2017;
		if (isLeapYear(year)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
		
	}

	private static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

}
