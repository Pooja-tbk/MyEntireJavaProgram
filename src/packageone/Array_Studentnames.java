package packageone;

public class Array_Studentnames {

	public static void main(String[] args) {
		String names[] = new String[3];
		names[0] = "Vinutha";
		names[1] = "Ganesh";
		names[2] = "sagar";

		int rollnum[] = new int[3];
		rollnum[0] = 77;
		rollnum[1] = 87;
		rollnum[2] = 12;

		char grade[] = new char[3];
		grade[0] = 'F';
		grade[1] = 'M';
		grade[2] = 'M';

		/*
		 * System.out.println(names);//if we execute this program get some garbage
		 * values we should not print like this
		 */

		System.out.println("Student Names" + "  " + "roll number" + "   " + "grade");

		for (int i = 0; i < 3; i++) {
			System.out.println(names[i] + "       " + rollnum[i] + "           " + grade[i]);
		}

	}

}
