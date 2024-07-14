package packageone;

public class Blocks {
	Blocks() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		new Blocks();

	}

	static {
		System.out.println("SIB1");
	}
	static {
		System.out.println("SIB2");
	}
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB1");
	}

}

