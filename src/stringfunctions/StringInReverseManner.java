package stringfunctions;

public class StringInReverseManner {

	public static void main(String[] args) {
		reverse_vertical_name();

	}

	static void reverse_vertical_name() {
		String input = "Priya";
		for (int i = input.length() - 1; i >= 0; i--) {
			char a2 = input.charAt(i);
			System.out.print(a2);
		}
	}

}
