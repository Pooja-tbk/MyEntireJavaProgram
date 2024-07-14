package abstaraction;

abstract class One_ClassA {
	abstract void all();

	void add() {
		System.out.println("ok");
	}
}

public class AbstarctionEX_One extends One_ClassA {

	public static void main(String[] args) {
		AbstarctionEX_One n1 = new AbstarctionEX_One();
		n1.all();
		n1.add();
	}

	void add() {
		System.out.println("abstract class overriden in child class");
	}

	void all() {
		System.out.println("abstract class overriden in child class");

	}
}