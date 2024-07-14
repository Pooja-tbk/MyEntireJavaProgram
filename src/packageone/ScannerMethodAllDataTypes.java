package packageone;

import java.util.Scanner;

public class ScannerMethodAllDataTypes {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		byte d1 = s1.nextByte();
		System.out.println(d1);
		int a1 = s1.nextInt();
		System.out.println(a1);
		short a2 = s1.nextShort();
		System.out.println(a2);
		long a3 = s1.nextLong();
		System.out.println(a3);
		float a4 = s1.nextFloat();
		System.out.println(a4);
		double a5 = s1.nextDouble();
		System.out.println(a5);
		String a6 = s1.next();
		System.out.println(a6);
		boolean a7 = s1.nextBoolean();
		System.out.println(a7);
		s1.close();

	}

}

