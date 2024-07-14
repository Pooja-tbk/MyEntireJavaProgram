package stringfunctions;

import java.util.Arrays;

public class SplitePrgram {
	public static void main(String[] args) {
		String s1="My name is Manish";
		String[] output=s1.split(" ");
			System.out.println(Arrays.toString(output));
			String[] op1=s1.split("M");
			System.out.println(Arrays.toString(op1));
	}

}
