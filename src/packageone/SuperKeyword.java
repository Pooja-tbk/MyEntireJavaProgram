package packageone;

class Parent_Property {
	void add() {
		System.out.println("parent class");
	}
}

public class SuperKeyword extends Parent_Property {

	void add() {
		super.add();
		System.out.println("child class");
	}

	public static void main(String[] args) {
		SuperKeyword n = new SuperKeyword();
		n.add();

	}

}
