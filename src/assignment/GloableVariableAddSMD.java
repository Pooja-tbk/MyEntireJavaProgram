package assignment;

public class GloableVariableAddSMD {
	
	static int a=20;//static global variable
	static int b=40;//static global variable
  
	
	static void add() {
		System.out.println("Addition: "+(a+b));
	
	}
	static void sub(){
		System.out.println("Subtraction: "+(b-a));
	}
	void mul()
	{
		System.out.println("Multiplication: "+(a*b));
	}
	void div() {
		System.out.println("Division: "+(b/a));
	}
	void mod()
	{
		System.out.println("Remainder: "+(b%a));
	}
	
	public static void main(String[] args) {
		GloableVariableAddSMD n1=new GloableVariableAddSMD();
		add();
		sub();
		n1.mul();
		n1.div();
		a=40;
		b=80;
		n1.mod();

	}

}

