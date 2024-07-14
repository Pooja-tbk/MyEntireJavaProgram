package stringmethods;

public class ClasstoCovrtLn {
	static void reverse_vertical() {
		String name = "Priya";
		for (int i = 0; i < name.length(); i++) {

			char arr[] = name.toCharArray();
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		reverse_vertical();

	}


}
