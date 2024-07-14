package abstaraction;

interface INTERFACE_parent {
	void add();

	void sub();

}

interface INTERFACE_parent_Two extends INTERFACE_parent {
	void mul();

	void div();
}

public class INTERFACE_CHILD implements INTERFACE_parent_Two, INTERFACE_parent {
	void mod() {
		System.out.println("modules");
	}

	public static void main(String[] args) {
		INTERFACE_CHILD n = new INTERFACE_CHILD();
		n.add();
		n.sub();
		n.mul();
		n.div();
		n.mod();
	}

	public void add() {
		System.out.println("addition");

	}

	public void sub() {
		System.out.println("subtraction");
	}

	public void mul() {

		System.out.println("multiplication");
	}

	public void div() {

		System.out.println("division");
	}

}
