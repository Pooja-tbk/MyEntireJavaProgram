package packageone;

import java.util.Arrays;
import java.util.Scanner;

//Create an array and print using the Arrays Class 

public class ArryasClass_Scanner {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		int rollnum[] = new int[3];

		for (int i = 0; i < rollnum.length; i++) {
			System.out.println("Enter the Array-->" + i);
			rollnum[i] = n.nextInt();

		}
		n.close();

		System.out.println(Arrays.toString(rollnum));

	}

}