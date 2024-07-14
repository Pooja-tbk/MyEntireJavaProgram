package packageone;

import java.util.Scanner;

public class AreaOfCircleUsingScannerC {

	void add(int r, double pi) {
		double result = pi * r * r;
		System.out.println("Area of circle : " + result);
	}

	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		AreaOfCircleUsingScannerC w1 = new AreaOfCircleUsingScannerC();
		int s1 = n1.nextInt();
		double s2 = n1.nextDouble();
		w1.add(s1, s2);
		n1.close();

	}

}