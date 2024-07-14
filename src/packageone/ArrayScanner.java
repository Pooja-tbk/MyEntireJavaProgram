package packageone;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		String name[] = new String[3];

		for (int i = 0; i < 3; i++)

		{
			System.out.println();
			System.out.println("Enter the name");
			name[i] = n.next();
			System.out.println(name[i]);
		}
		n.close();

	}

}
