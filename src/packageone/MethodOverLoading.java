package packageone;

public class MethodOverLoading {

	void add() {
		int a = 100;
		System.out.println(a + 6);
	}

	void add(int a) {
		System.out.println(a + 6);
	}

	static void add(double a) {
		System.out.println(3);
	}

	void add(int a, int b, int c) {
		a = 100;// a=100
		System.out.println((a + 6) + " " + (b + 6) + " " + (c + 1));
	}

	void sub(double a, double b) {
		System.out.println();
	}

	public static void main(String[] args) {
		MethodOverLoading n1 = new MethodOverLoading();
		add(3.14);
		n1.add();
		n1.add(4);
		n1.add(2, 4, 7);
		n1.sub(2.1, 1.1);

	}

}

