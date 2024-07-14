package packageone;

public class ThisCalling {
	ThisCalling() {
		this(20);
		System.out.println("1");
	}

	ThisCalling(int a) {
		this("Pooja");
		System.out.println("2");

	}

	ThisCalling(String a) {
		System.out.println("3");
	}

	public static void main(String[] args) {
		new ThisCalling();

	}

}
