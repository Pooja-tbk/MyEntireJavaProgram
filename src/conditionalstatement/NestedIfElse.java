package conditionalstatement;

public class NestedIfElse {

	public static void main(String[] args) {

		char grade1 = 'A';
		
		int marks = 100;

		if (marks >= 100) {

			if (grade1 == 'A') {
				System.out.println("Student is passed");
			}

			else {

				System.out.println("Student is just passed");
			}

		}

		else {
			System.out.println("Student is failed");
		}
		if (marks < 100) {

			if (grade1 == 'B') {
				System.out.println("Student is second class");
			}

			else {

				System.out.println("Student is just passed");
			}

		}

		else {
			System.out.println("Student is failed");
		}

	}
}