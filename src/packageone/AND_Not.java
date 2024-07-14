package packageone;

public class AND_Not {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		if (a > b || a != b)// oR operator
		{
			System.out.println("true");
		}

		if (a < b && a == b)// AND operator
		{
			System.out.println("false");
		}

	}
}
