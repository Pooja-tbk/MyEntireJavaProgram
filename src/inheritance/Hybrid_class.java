package inheritance;


class Grand_P {
	static void add() {
		System.out.println("grand parent");
	}
}

class Parent_one extends Grand_P {
	static void sub() {
		System.out.println("Parent one");

	}
}

class child_one extends Parent_one {
	static void mul() {
		System.out.println("Multiplication");
	}
}

public class Hybrid_class extends Grand_P {

	public static void main(String[] args) {
		add();
		Parent_one.sub();
		child_one.mul();

	}

}


