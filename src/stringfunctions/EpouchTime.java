package stringfunctions;

import java.util.Date;

public class EpouchTime {
	public static void main(String[] args) {
		Date d1 = new Date();// concrete class
		System.out.println(d1);// human understandable time
		String input = d1.toString();// convert human understandable time to string
		System.out.println(input);// why?

		// 05 May 2024
		String month = input.substring(4, 7);
		System.out.println(month);
		String date = input.substring(8, 10);
		System.out.println(date);
		String year = input.substring(input.length() - 4);
		System.out.println(year);

		System.out.println(date + " " + month + " " + year);

		// 05-May-2024
		System.out.println(date + "-" + month + "-" + year);
		// 05/May/2024
		System.out.println(date + "/" + month + "/" + year);

	}
}

