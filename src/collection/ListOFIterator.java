package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListOFIterator {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Ram");
		a1.add("Umesh");
		a1.add(12);
		a1.add("67");
		a1.add(true);
		a1.add(98);
		System.out.println(a1);
		
		System.out.println("forward iterator using Listofieterator/iterator");
		ListIterator i1=a1.listIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("backward iterator using Listofiterator");
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
	}
}
