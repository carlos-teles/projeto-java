package util;

public class Utilitarios {

	public Utilitarios() {
		// TODO Auto-generated constructor stub
	}

	public static boolean checkMe(String s) {
		boolean amIValid = false;
		try {
			Integer.parseInt(s);
			// s is a valid integer!
			amIValid = true;
		} catch (NumberFormatException e) {
			// sorry, not an integer
			// we just move on, but you could have code here
		}

		return amIValid;
	}

}
