package stringfunctions;

public class StringInverticalManner {
	static void reverse_vertical_name() {
		String input = "Priya";
		for (int i = input.length() - 1; i >= 0; i--) {
			char a2 = input.charAt(i);
			System.out.print(a2);
		}
	}

	public static void main(String[] args) {
		reverse_vertical_name();

		System.out.println("========");

		String input = "Priya";

		for (int i = 0; i < input.length(); i++) {
			char a1 = input.charAt(i);
			System.out.println(a1);

		}
	}

}
