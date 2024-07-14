package stringfunctions;

public class NumberPresent {
	public static void main(String[] args) {

		int num[] = new int[4];
		num[0] = 1;
		num[1] = 45;
		num[2] = 1;
		num[3] = 1;
		int givennum = 45;

		for (int i = 0; i < num.length; i++) {

			if (givennum == num[i]) {
				System.out.println("number is present");

			}

			else {
				System.out.println("number is not is present");
			}

		}

	}


}
