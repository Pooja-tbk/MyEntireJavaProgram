package collection;

import java.util.ArrayList;

public class Collection_methods {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Ram");
		a1.add("Umesh");
		a1.add(12);
		a1.add("67");
		a1.add(true);
		a1.add(98);//method 1
		System.out.println("a1 index :"+a1);
		a1.remove(0);//remove at index
		System.out.println(a1);//removed object RAM at index 0
		a1.remove("67");//remove(complete object)
		System.out.println(a1);
		
		//System.out.println("a1 before clearing : "+a1);
		//a1.clear();// clear method
		//System.out.println("a1 after clearing : "+a1);
		
		boolean c=a1.isEmpty();//isEmpty method
		System.out.println(c);
		
		
		ArrayList a2=new ArrayList();
		a2.addAll(a1);//method
		a2.add(1, "Manish");
		a2.addAll(1, a1);
		System.out.println("a2 data : "+a2);
		
		//System.out.println("before removing : "+a2);
		//a2.removeAll(a1);
		//System.out.println("After removing : "+a2);
		
		ArrayList a3=new ArrayList();
		a3=(ArrayList) a2.clone();//clone method(duplicate),replica of a2
		System.out.println("a3 data : "+a3);
		
		
		
	}

}

