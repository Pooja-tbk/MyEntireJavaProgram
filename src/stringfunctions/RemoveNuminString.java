package stringfunctions;

///in the given string remove all the numeric value

public class RemoveNuminString {

	public static void main(String[] args) {
		String input="School123";
		
		String output=input.replace('o', ' ');
		System.out.println(output);
		
		String output1=input.replace('o', 'a');
		System.out.println(output1);
		
		String output2=input.replaceAll("[0-9]", " ");
		System.out.println(output2);
		
 String	u=input.replace('S', 'a');
 System.out.println(u);
		
 String y=input.replaceAll("(a-z)"," ");
 System.out.println(y);
	}

}