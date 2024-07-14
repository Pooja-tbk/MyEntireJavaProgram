package arraysfunction;


import java.util.Scanner;

public class StudentArrayFromScannerClass {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		String names[] = new String[4];

		for (int i = 0; i < names.length; i++) {
			names[i] = n.next();
			System.out.println(names[i]);
		}
		n.close();

	}

}
