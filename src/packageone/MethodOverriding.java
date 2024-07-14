package packageone;

class Ridding {
	Ridding() {
		System.out.println("one");
	}

}

class Ridd extends Ridding {
	Ridd() {
		System.out.println("two");
	}

}

class Red extends Ridd {
	Red() {
		System.out.println("three");
	}

}

public class MethodOverriding extends Red {
	MethodOverriding() {

		System.out.println("two");
	}

	public static void main(String[] args) {
		new MethodOverriding();

	}

}

