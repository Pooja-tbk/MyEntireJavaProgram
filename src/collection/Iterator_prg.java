package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_prg {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Ram");
		a1.add("Umesh");
		a1.add(12);
		a1.add("67");
		a1.add(true);
		a1.add(98);
		System.out.println(a1);
		
		Iterator i1=a1.iterator();//Iterator is interface=abstract method
		while(i1.hasNext())//keep on check whether the new/next element really present or not will give result as true or false
		{
			System.out.println(i1.next());//next method iteration in the forward direction
		}
	
	}

}
