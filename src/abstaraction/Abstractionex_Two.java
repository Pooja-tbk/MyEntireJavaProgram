package abstaraction;

class Addition {
	void add() {
		System.out.println("addition");
	}
}

public class Abstractionex_Two extends Addition {
	void add() {

		System.out.println("subtraction");
		super.add();
	}

	public static void main(String[] args) {
		Abstractionex_Two n1 = new Abstractionex_Two();
		n1.add();

	}

}