package inheritance;

class Grand_Pp {
	void mul() {
		System.out.println("Grand parent");

	}
}

class P_one extends Grand_Pp {
	void add() {
		System.out.println("Parent class property");
	}
}

public class SingleLevelInheritance extends P_one {
	void sub() {
		System.out.println("child class property");
	}

	public static void main(String[] args) {
		SingleLevelInheritance n = new SingleLevelInheritance();
		n.mul();
		n.add();
		n.sub();

	}

}
