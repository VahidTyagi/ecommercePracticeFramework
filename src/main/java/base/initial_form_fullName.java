package base;

public class initial_form_fullName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullName = "John Doe Smith";
		String initials = getInitials(fullName);
		System.out.println("Full Name: " + fullName);
		System.out.println("Initials: " + initials);
		
		

	}

	private static String getInitials(String fullName) {
		// TODO Auto-generated method stub
		if (fullName == null || fullName.isEmpty()) {
			return "";
		}
		String[] names = fullName.split(" ");
		StringBuilder initials = new StringBuilder();
		for (String name : names) {
			if (!name.isEmpty()) {
				initials.append(name.charAt(0));
			}
		}
		return initials.toString().toUpperCase();
	}

}
