package stringfunctions;

public class ReplaceAlphabetsInString {
public static void main(String[] args) {
		
		String name="School123";
		
		String output2=name.replaceAll("[a-z]", "");
		System.out.println(output2);
		
		
		//how to remove capital letter
		
		String output3=name.replaceAll("[A-Z]", " ");
		System.out.println(output3);

	}

}
