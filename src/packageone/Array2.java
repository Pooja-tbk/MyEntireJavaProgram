package packageone;

public class Array2 {

	public static void main(String[] args) {
		String names[] = new String[3];
		names[0] = "Vinutha";
		names[1] = "Ganesh";
		names[2] = "sagar";

		int rollnum[] = new int[3];
		rollnum[0] = 21;
		rollnum[1] = 22;
		rollnum[2] = 23;

		char gender[] = new char[3];
		gender[0] = 'F';
		gender[1] = 'M';
		gender[2] = 'M';

		System.out.println("names" + "  " + "rollnumber" + "  " + "gender");

		for (int i = 0; i < 3; i++) {

			System.out.println(names[i] + "   " + rollnum[i] + "   " + "   " + gender[i]);

		}
		
	}

}
