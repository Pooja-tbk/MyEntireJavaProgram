package packageone;

public class ArrayPrgm_one {

	public static void main(String[] args) {

		String names[] = new String[3];// declaration and initialization of array
		// or
		// String []names=new String[3];

		names[0] = "Jyothi";
		names[1] = "Nithin";
		names[2] = "shaik";

		// System.out.println(names[0]);
		// System.out.println(names[1]);
		// System.out.println(names[2]);

		// or

		for (int i = 0; i < 3; i++) {
			System.out.println(names[i]);
		}

	}

}

