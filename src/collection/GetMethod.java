package collection;

import java.util.ArrayList;

public class GetMethod {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(15);
		a1.add(76);
		a1.add(900);
		a1.add(-120);
		a1.add(65);
		a1.add(23);
		System.out.println(a1.get(2));
		System.out.println(a1);
		System.out.println(a1.set(0, "Ram"));
		//Collections.sort(a1);
		System.out.println(a1);

	}
}
