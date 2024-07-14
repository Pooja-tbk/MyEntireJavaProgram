package packageone;

public class IIB_Constructor {
	IIB_Constructor() {

		System.out.println("Constructor");
	}

	public static void main(String[] args) {

		System.out.println("Main method");
		new IIB_Constructor();

	}

	{
		System.out.println("IIB block 1");
	}
	{
		System.out.println("IIB block 2");
	}

}
