package assignment;

import java.util.Scanner;

public class ScannerClassForAddSubMulDiv {

	static void add(byte a,byte b)
	{
		int sum=a+b;
		System.out.println("Addition of a and b is : "+sum);

	}
	static void sub(short a,short b)
	{
		int subt=b-a;
		System.out.println("Subtraction of a and b is :"+subt);

	}
	static void mul(float a,double b)//Quotient
	{
		double result=a*b;
		System.out.println("Multiplication of a and b is : "+result);
	}
	static void div(int a,int b)
	{
		int quotient=b/a;
		System.out.println("quotient of a and b : "+quotient);
	}
	static void mod(int a,int b)
	{
		int remainder=b/a;
		System.out.println("Remainder of a and b is : "+remainder);

	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		byte a1=s1.nextByte();
		byte b1=s1.nextByte();
		add(a1,b1);
		short a2=s1.nextShort();
		short b2=s1.nextShort();
		sub(a2,b2);
		float a3=s1.nextFloat();
		double b3=s1.nextDouble();
		mul(a3,b3);
		int a4=s1.nextInt();
		int b4=s1.nextInt();
		div(a4,b4);
		int a5=s1.nextInt();
		int b5=s1.nextInt();
		mod(a5,b5);
		s1.close();
	}

}

