package stringfunctions;

public class MatchFucntions {
	public static void main(String[] args) {
		String input="Manish";
		System.out.println(input.matches("M(.*)"));//(.*)=%
		
		System.out.println(input.matches("(.*)h"));
		

	}

}
