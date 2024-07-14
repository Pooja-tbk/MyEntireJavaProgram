package arraysfunction;

import java.util.Arrays;

public class Count_Numeric {
	static int count_numeric = 0;

	public static void main(String[] args) {

		String name = "Manish123";

		char[] p = name.toCharArray();

		System.out.println(Arrays.toString(p));

		for (int i = 0; i < p.length; i++) {

			boolean answer = Character.isDigit(p[i]);

			if (answer == true) {
				count_numeric++;

			}

		}
		System.out.println("number of numeric : " + count_numeric);
	}

}

