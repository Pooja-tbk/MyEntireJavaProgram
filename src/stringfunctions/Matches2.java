package stringfunctions;

public class Matches2 {
	public static void main(String[] args) {
		String name="Manish&^%";
		
		System.out.println(name.matches("(.*)&(.*)"));

	}

}
