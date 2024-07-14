package stringfunctions;

public class StringMethods_one {

	public static void main(String[] args) {
		String name = "School";

		// name.length>return type int
		// System.out.println(name.length());
		// or
		int length_of_string = name.length();
		System.out.println(length_of_string);
		System.out.println(name.charAt(2));// giving the character at the given index position
		System.out.println(name.indexOf('c'));// giving index of given char
		System.out.println(name.toUpperCase());// convert given string into upper case
		System.out.println(name.toLowerCase());// convert given string into lower case
		System.out.println(name.concat("name is ABC public school"));// performs concatenation/combining two Strings
		String first_name = "Manish0";
		String second_namr = "Tiwari";
		System.out.println(first_name.concat("  ").concat(second_namr));
		System.out.println(name.contains("Sch"));// Checks The give char sequence is present in the given string,java is
													// case sensitive

	}

}
