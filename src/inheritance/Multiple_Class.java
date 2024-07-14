package inheritance;

class Class_One {
	static void add() {
		System.out.println("one class");
	}

	void mul() {
		System.out.println("one more class");
	}

	public class Multiple_Class {
		static void sub() {
			System.out.println("subtraction");
		}

		public static void main(String[] args) {

			sub();
			Class_One.add();// class_name.method_name

			new Class_One().mul();// new class_name.method_name
		}
	}
}