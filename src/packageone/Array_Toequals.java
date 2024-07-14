package packageone;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Toequals {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		int rollnum[] = new int[3];

		for (int i = 0; i < rollnum.length; i++) {
			System.out.println("Enter the Array-->" + i);
			rollnum[i] = n.nextInt();
		}

		int rollnum1[] = new int[3];

		for (int i = 0; i < rollnum1.length; i++) {
			System.out.println("Enter the Array-->" + i);
			rollnum1[i] = n.nextInt();
		}

		System.out.println(Arrays.equals(rollnum, rollnum1));
		n.close();
	}
	
}

