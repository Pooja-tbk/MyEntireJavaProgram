package loops;

public class ForLoop {

	public static void main(String[] args) {

		// wpt print numbers from 1 to 10 using for loop

		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}

		// wpt print numbers from 19 to 26 using for loop

		for (int i = 19; i <= 26; i++) {
			System.out.println(i);
		}

		/* Negative program using for loop */

		/*
		 * for(int i=-1;i<=1;i--) { System.out.println(i);//infinite loop }
		 */

		for (int i = -1; i < 2; i++) {
			System.out.println(i);// -1 0 1
		}
	}

}
