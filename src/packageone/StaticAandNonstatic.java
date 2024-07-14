package packageone;


public class StaticAandNonstatic {
	static void add() {
		int a = 10;
		int b = 25;
		System.out.println(a + b);
	}

	static void sub() {
		int c = 20;
		int d = 50;
		System.out.println(d - c);
	}

	public static void main(String[] args) {
		add();
		sub();

	}
}