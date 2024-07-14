package stringfunctions;

public class StringMethods_two {
	public static void main(String[] args) {
		String name = "Manish Kumar Tiwari";

		System.out.println(name.contains("Tiwari"));
		String title_of_page = "     We are here for you online needs    ";
		System.out.println("Before trim : " + title_of_page);
		System.out.println("after trim : " + title_of_page.trim());
		String name1="";
		boolean a1=name1.isEmpty();
		System.out.println(a1);
	}

}
