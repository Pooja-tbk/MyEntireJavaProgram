package arraysfunction;

import java.util.Arrays;

public class Count_alpha {
	static int count_alpha = 0;

	public static void main(String[] args) {

		String name = "Manish";

		char[] c1 = name.toCharArray();// convert string to char

		System.out.println(Arrays.toString(c1));// Arrays is concrete class,toString is static method

		for (int i = 0; i < c1.length; i++) {
			boolean answer = Character.isAlphabetic(c1[i]);// check for alphabets in string
			// System.out.println(answer);
			if (answer == true) {
				count_alpha++;
			}

		}

		System.out.println("count of alphabets : " + count_alpha);
	}

}

