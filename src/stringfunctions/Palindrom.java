package stringfunctions;

public class Palindrom {
	public static void main(String[] args) {
		String input = "radar";
		String reverse = "";

		for (int i = input.length() - 1; i >= 0; i--)

		{
			char c1 = input.charAt(i);
			reverse = reverse + c1;

		}
		if (input.equals(reverse)) {
			System.out.println("it is a palindrom");
		} else {
			System.out.println("it is not a palindrom");
		}

	}

}
