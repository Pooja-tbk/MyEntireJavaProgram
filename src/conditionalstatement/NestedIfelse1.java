package conditionalstatement;

public class NestedIfelse1 {
	public static void main(String[] args) {
		int ticket_cost = 200;
		char gender1 = 'M';

		if (ticket_cost >= 200) {

			if (gender1 == 'M') {
				System.out.println("this ticket cost is eligible for Male");
			}

			else {
				System.out.println(" ticket cost is eligible for Female");

			}
		}

		else {
			System.out.println("above genders not eligible for this ticket cost");
		}

	}
}

