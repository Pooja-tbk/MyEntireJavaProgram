package arraysfunction;

import java.util.Arrays;

public class Count_NOspace {
	static int count_space = 0;

	public static void main(String[] args) {
		String input = "Manish Kumar Tiwari";

		char c1[] = input.toCharArray();

		System.out.println(Arrays.toString(c1));

		for (int i = 0; i < c1.length; i++) {

			boolean answer1 = Character.isSpaceChar(c1[i]);

			if (answer1 == true) {
				count_space++;
			}

		}
		System.out.println("number of space in string  : " + count_space);
	}

}

