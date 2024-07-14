package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Class {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement("Pooja");
		v1.addElement("Ram");
		v1.addElement("janu");
		v1.addElement("kanu");
		System.out.println(v1);
		
		Vector v2=new Vector();
		v2.addAll(v1);
		v2.add("jassi");
		v2.addElement("kanmani");
		System.out.println(v2);
		
		Enumeration e=v2.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
	
}
