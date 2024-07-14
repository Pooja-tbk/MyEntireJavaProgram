package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

//customer will enter either 3,4 or any string value

public class ExceptionAssignement {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		try{
			int n1=s1.nextInt();
		
			String name[]=new String[n1];
		
		name[0]="ram";
		name[1]="Sita";
		name[2]="pooja";
		name[3]="resh";
		for(int i=0;i<name.length;i++) {
		System.out.println(name[i]);
		}
		}
		
		catch(ArrayIndexOutOfBoundsException c1)
		{
			System.out.println("handled exception 1");
		}
		
		catch(InputMismatchException c2) {
			System.out.println("handled exception 2");
		}
		s1.close();
	}

}
