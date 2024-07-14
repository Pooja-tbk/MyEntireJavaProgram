package packageone;

public class CallingNonstaticM2 {
	void add()// 3. non static add() method called by main method by using object
	{
		int a = 100;
		int b = 200;
		System.out.println(a + b);// 4.o/p= 300
	}

	public static void main(String[] args) {

		CallingNonstaticM2 n1 = new CallingNonstaticM2();// 1.Syntax of calling non static method
		n1.add();// 2.reference variable n1, nonstatic method add(), main method calling method
					// add()
	}

}