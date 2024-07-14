package inheritance;


final class GParent_finalclass { // if class is final we can't inherite the final class
	void add() {
		System.out.println("Fianl parent class can't be inherite");
	}
}

class Parent_C {
	void sub() {
		System.out.println("parent class");
	}
}

public class FinallInheritance extends Parent_C {

	public static void main(String[] args) {
		FinallInheritance s = new FinallInheritance();// child class object

		GParent_finalclass n = new GParent_finalclass();// final class object
		n.add();
		s.sub();

	}

}