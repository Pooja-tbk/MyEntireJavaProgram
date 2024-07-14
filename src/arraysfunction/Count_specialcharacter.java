package arraysfunction;

import java.util.Arrays;

public class Count_specialcharacter {
	static int cout_alpha = 0;
	static int count_numerics = 0;
	static int count_space = 0;
	static int count_specialc;

	public static void main(String[] args) {

		String name = "Manish123 ^!";

		char[] c1 = name.toCharArray();

		System.out.println(Arrays.toString(c1));// coverting

		for (int i = 0; i < c1.length; i++) {

			boolean answer = Character.isAlphabetic(c1[i]);

			if (answer == true) {
				cout_alpha++;
			}

			boolean answer1 = Character.isDigit(c1[i]);
			if (answer1 == true) {

				count_numerics++;
			}

			boolean answer2 = Character.isSpaceChar(c1[i]);
			if (answer2 == true) {

				count_space++;

			}
		}

		System.out.println("count of alphabets : " + cout_alpha);
		System.out.println("count of numbers : " + count_numerics);
		System.out.println("count of spaces : " + count_space);

		int specialc = cout_alpha + count_numerics + count_space;
		System.out.println("total count : " + specialc);

		count_specialc = c1.length - specialc;

		System.out.println("Total legnth of special character : " + count_specialc);

	}

}

