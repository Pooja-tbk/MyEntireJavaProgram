package typecasting;

class Batch {
	static void add() {
		System.out.println("Parent class");
	}
}

public class UpcastingAutomationbatch41 extends Batch {

	public static void main(String[] args) {
		Batch b = new UpcastingAutomationbatch41();
		System.out.println(b);

		UpcastingAutomationbatch41 downn = (UpcastingAutomationbatch41) b;
		System.out.println(downn);

	}

}