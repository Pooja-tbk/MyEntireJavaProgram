package stringfunctions;

import java.util.Arrays;

public class StringContainsOnlyDigits {

	static int countdigit;


	public static void main(String[] args) {
		String name="123";
		
		char[] op=name.toCharArray();
		System.out.println(Arrays.toString(op));
		
		int op1=name.length();
		
		for(int i=0;i<op.length;i++)
		{
			
		boolean answer=Character.isDigit(op[i]);
		if(answer==true) {
			countdigit++;
			
		}
		}
		System.out.println(countdigit);
		
		if(countdigit==op1)
		{
			System.out.println("it contains only number");
		}
		else {
			System.out.println("it is not contains only digits");
		
		}

	}
}
