package abstaraction;

abstract class Sunday {

	abstract void add();

}

public class Abstraction extends Sunday {

	public static void main(String[] args) {

		Abstraction n1 = new Abstraction();
		n1.add();

	}

	void add() {
		System.out.println("add");

	}

}