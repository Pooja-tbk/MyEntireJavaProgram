package arraysfunction;


import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {

		String names[] = new String[4];
		names[0] = "Pooja";
		names[1] = "shilpa";
		names[2] = "sowyaa";
		names[3] = "Ramya";

		System.out.println("names :        " + Arrays.toString(names));

		String copyname[] = new String[names.length];
		
		for (int i = 0; i < names.length; i++) {
			copyname[i] = names[i];

		}
		System.out.println("copied names : " + Arrays.toString(copyname));

	}

}
