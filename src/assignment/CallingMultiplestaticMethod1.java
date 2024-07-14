package assignment;

public class CallingMultiplestaticMethod1 {

	public static void add()
	{
		int a;//declaration
		a=10;//initialization
		int b=20;
		System.out.println(a+b);//o/p=30
	}
	static void sub()
	{
		int a=20;//declaration or initialization
		int b=10;
		System.out.println(a-b);//o/p=10
	}
	static void mul()
	{
		int a=20;
		int b=40;
		System.out.println("multiplication output: "+(a*b));//o/p=800
	}
	static void div()
	{
		int a=40;
		int b=20;
		int res=a/b;
		System.out.println("q :"+res);//Remainder: 2
	}
	static void mod()
	{
		int a=4;
		int b=2;
		int result=a%b;
		System.out.println("R :"+result);// 0
	}
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();	
	}
}
