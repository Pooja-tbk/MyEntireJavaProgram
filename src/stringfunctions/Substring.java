package stringfunctions;

public class Substring {
	public static void main(String[] args) {
		String name="Manish Kumar Tiwari";
		
		System.out.println(name.substring(1));
		System.out.println(name.substring(13));
		System.out.println(name.substring(0, 6));
		System.out.println(name.substring(7, 12));
		System.out.println(name.substring(13, 19));//(index,length)
	}

}
