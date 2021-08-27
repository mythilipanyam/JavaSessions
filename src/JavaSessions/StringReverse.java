package JavaSessions;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println(stringReverse("chandra"));

	}

	public static String stringReverse(String value) {

		String rev = "";
		if (value.length() == 1) {
			return value;
		}

		for (int i = value.length() - 1; i >= 0; i--) {
			rev = rev + value.charAt(i);
		}
		return rev;
	}

}
