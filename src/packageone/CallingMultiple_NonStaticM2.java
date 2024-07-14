package packageone;

public class CallingMultiple_NonStaticM2 {

	void add()// 3. non static add() method called by main method by using object
	{
		int a = 100;
		int b = 200;
		System.out.println(a + b);// 4.o/p= 300
	}

	void sub()// 4. non static sub() method called by main method by using object
	{
		int a = 200;
		int b = 100;
		System.out.println(a - b);// 4.o/p= 100
	}

	public static void main(String[] args) {

		CallingMultiple_NonStaticM n1 = new CallingMultiple_NonStaticM();// 1.Syntax of calling non static method
		n1.add();// 2.reference variable n1, nonstatic method add(), main method calling method
					// add()
		n1.sub();
	}
}

