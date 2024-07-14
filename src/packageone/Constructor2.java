package packageone;

public class Constructor2 {
	Constructor2() {
		System.out.println("a");
	}

	Constructor2(String vee) {
		System.out.println("b");
	}

	Constructor2(int x, int y, boolean t, double g, int h, int o, double m) {
		System.out.println(y);
	}

	public static void main(String[] args) {
	new Constructor2();
	new Constructor2("veena");
	new Constructor2(180, 200, false, 34.67, 56, 444556, 7.9);

	}

}
