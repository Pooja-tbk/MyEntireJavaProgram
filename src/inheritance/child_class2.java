package inheritance;

public class child_class2 extends ParentClass {
	void mul() {
		System.out.println("multiplication");
	}

	public static void main(String[] args) {
		child_class2 s1 = new child_class2();
		add();
		s1.mul();

	}
}
