package inheritance;

class Parent_1 {
	static void mul() {
		System.out.println("superparent");
	}
}

class Parent extends Parent_1 {
	static void add() {

		System.out.println("parent");

	}
}

public class Inheritence_class extends Parent {
	void sub() {

		System.out.println("child");
	}

	public static void main(String[] args) {
		add();
		Inheritence_class n1 = new Inheritence_class();
		n1.sub();
		mul();

	}

}
