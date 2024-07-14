package collection;

import java.util.ArrayList;

public class Collection_Prgm {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Ram");
		a1.add("Umesh");
		a1.add(12);
		a1.add(16);
		a1.add(true);
		a1.add(98);
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		
		a2.addAll(a1);
		a2.add(1,"Manish");//[Ram,Manish,Umesh, 12, 16, true, 98]
		a2.addAll(0, a1);//
		System.out.println(a2);//[Ram, Umesh, 12, 16, true, 98, Ram, Manish, Umesh, 12, 16, true, 98]
	}

}
