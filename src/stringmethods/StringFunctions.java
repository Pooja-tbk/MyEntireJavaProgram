package stringmethods;

public class StringFunctions {

	public static void main(String[] args) {
		String name = "College";

		System.out.println(name.length());
		System.out.println(name.charAt(4));
		String first_name = "Automation";
		String second_name = "  batch41  ";
		System.out.println(first_name.concat(" ").concat(second_name));
		System.out.println(name.contains("Coll"));
		System.out.println(first_name.contains("auto"));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.indexOf('l'));
		System.out.println(second_name.trim());

	}
}
