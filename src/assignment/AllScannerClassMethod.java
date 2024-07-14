package assignment;

import java.util.Scanner;

public class AllScannerClassMethod {
	static void disply() {
		Scanner s1=new Scanner(System.in);
		byte d1=s1.nextByte();
		System.out.println(d1);
		
	}
	static void un(){
		Scanner s1=new Scanner(System.in);
		short a=s1.nextShort();
		System.out.println(a);

	}
	static void rst() {
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		System.out.println(a);

	}
	static void result() {
		Scanner s1=new Scanner(System.in);
		long a=s1.nextLong();
		System.out.println(a);
		

	}
	static void bng() {
		Scanner s4=new Scanner(System.in);
		float b=s4.nextFloat();
		System.out.println(b);
		s4.close();
	}
	static void dvg() {
		Scanner s3=new Scanner(System.in);
		double c=s3.nextDouble();
		System.out.println(c);
		s3.close();
	
	}
	static void msy() {
		Scanner s1=new Scanner(System.in);
		String d=s1.next();
		System.out.println(d);
		s1.close();
		
	}
	static void coorg() {
		Scanner s2=new Scanner(System.in);
		boolean d=s2.nextBoolean();
		System.out.println(d);
		s2.close();

	}
	
	public static void main(String[] args) {
		disply();
		un();
		rst();
		result();
		bng();
		dvg();
		msy();
		coorg();		
		
		
	}
	

}

