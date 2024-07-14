package collection;

import java.util.Stack;

public class Stack_class {

	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.push("1");
		s1.push("2");
		s1.push("pooja");
		System.out.println(s1);
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		

	}

}
