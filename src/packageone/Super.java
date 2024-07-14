package packageone;

class One {
	One(char g) {

		System.out.println("addition1");
	}
}

class Two extends One {
	Two(int a) {
		super('h');
		System.out.println("result2");
	}
}

class Three extends Two {
	Three() {
		super(100);
		System.out.println("result3");
	}
}

public class Super extends Three {

	public static void main(String[] args) {

		new Super();

	}
}
