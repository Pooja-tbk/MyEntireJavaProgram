package packageone;

public class LocalVariable {
	static void add() {
		int a = 2;// local variable a and b scope inside the add variable
		int b = 3;// local variable brown in color
		System.out.println(a + b);// utilization
	}

	void sub(int a, int b) {

		System.out.println(b - a);// this local variable different from add method variable
									// scope of variables inside the method so we can take
									// same variables in different methods
	}

	public static void main(String[] args) {
		int a;// declaration of local variable
		a = 10;// initialization of local variable
		System.out.println(a);// utilization of local variable
		LocalVariable n1 = new LocalVariable();
		n1.sub(2, 4);
		add();

	}

}
