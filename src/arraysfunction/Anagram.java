package arraysfunction;

import java.util.Arrays;

//in a string Manish find out the number of capital letters involved

public class Anagram {

	public static void main(String[] args) {//arm=ram sme letters with diff
		String f_name="Bread";
		String s_name="Beard";
		if(f_name.length()!=s_name.length())
		{
			System.out.println("They are not anagram");//if both string length is not equal means if block will execute
		}
		
		char[] c1=f_name.toCharArray();
		char[] c2=s_name.toCharArray();
		
		System.out.println("Before sorting");
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));//converted to string of array
		//sort both the array
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		if(Arrays.equals(c1, c2)==true)
		{
			System.out.println("They are anagram");
		}
		else
		{
			System.out.println("They are not anagram");
		}
		
	
	}
}
