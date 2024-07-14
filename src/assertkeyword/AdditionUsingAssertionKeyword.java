package assertkeyword;

public class AdditionUsingAssertionKeyword {
	static void add(int a,int b) {
		assert a!=100;
		int sum=a+b;
		System.out.println(sum);
	}


	public static void main(String[] args) {
		add(2,3);
		String name="Ram";
		assert name.length()>0:"the lenght is 0 or less";
		System.out.println(name.concat("jathin"));

	}

}
