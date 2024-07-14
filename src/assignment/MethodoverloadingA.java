package assignment;

public class MethodoverloadingA {
	static void add()//all method has same variation in argument
	{
		System.out.println("first");
	}
	static void add(int a)
	{
		System.out.println("second");
	}
	static void add(double a)
	{
		System.out.println("third");
	}
	static void add(int a,double b)
	{
		System.out.println("fourth");
	}
	void add(char c,String d)
	{
		System.out.println("sixth");
	}
	
	public static void main(String[] args) {
		add();
		add(2);
		add(3.14);
		add(2,4.14);
		MethodoverloadingA n1=new MethodoverloadingA();
		n1.add('c',"word");	
	}
}