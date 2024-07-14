package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		
		try{

			int age=s1.nextInt();
			System.out.println(age);
		}
		catch(InputMismatchException a1) {
			System.out.println("Handling the excxeption");
			
		}
		catch(NullPointerException a2)
		{
			System.out.println("Handling the excxeption 1");
		}
		catch(IndexOutOfBoundsException a3) {
			System.out.println("Handled the exception 2");
		}
		s1.close();
		
	}

}
