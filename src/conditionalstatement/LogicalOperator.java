package conditionalstatement;

public class LogicalOperator {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		if (!(a > b || a != b))// OR-NOT operator
		{
			System.out.println("true");
		}

		if (!(a < b && a == b))// AND-NOT operator
		{
			System.out.println("false");
		}

	}

}