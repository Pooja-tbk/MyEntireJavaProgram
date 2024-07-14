package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Upcast_ArrayListTO_List {
public static void main(String[] args) {
		
		System.out.println("Lets understand everything about List");
		ArrayList a1=new ArrayList();
		a1.add("pen");
		a1.add("pencil");
		a1.add("box");
		a1.add("bottle");
		System.out.println(a1);//List follow indexing
		//follow the oder of insertion
		a1.add("pen");//List allow duplicates
		System.out.println(a1);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);//List allows null as many as passed, allows multiple null value
		
		Iterator i1=a1.iterator();
		 while(i1.hasNext())
		 {
			 System.out.println(i1.next());
		 }
		 
		System.out.println("Lets understand everthing about set");
		Set a2=new HashSet();//add method coming from List
		a2.add("pen");
		a2.add("pen");
		a2.add("pencil");
		a2.add("box");
		a2.add("bottle");
		System.out.println(a2);//set not following indexing, hashcode value
		//not follow the order of insertion
		a2.add("pen");
		System.out.println(a2);//set not allow duplicates
		a2.add(null);
		a2.add(null);
		System.out.println(a2);//set will not allow to have multiple null, it allows only one beacuse set not allow dublicates
		
	}

}
