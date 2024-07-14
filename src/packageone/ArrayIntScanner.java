package packageone;

import java.util.Scanner;

public class ArrayIntScanner {

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		int rollnum[] = new int[3];

		/*
		 * rollnum[0]=n.nextInt(); rollnum[1]=n.nextInt(); rollnum[2]=n.nextInt();
		 */

		// or

		for (int i = 0; i < rollnum.length; i++) {
			System.out.println();
			System.out.println("Enter the rollnumber");
			rollnum[i] = n.nextInt();
			System.out.println(rollnum[i]);
		}
n.close();
	}

}
