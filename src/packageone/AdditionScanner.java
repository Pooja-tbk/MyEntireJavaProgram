package packageone;


import java.util.Scanner;

public class AdditionScanner {

	public static void add(int x, int y) {
		int res = x + y;
		System.out.println("Addition of x and y is : " + res);
	}

	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		int a1 = n1.nextInt();
		int a2 = n1.nextInt();
		add(a1, a2);
		n1.close();

	}

}
