package exceptionhandling;

public class Exceptionprg1 {
	public static void main(String[] args) {
		try {
			int c=1/0;
			System.out.println(c);
		}
		catch(ArithmeticException c1) {
			System.out.println("catch will execute");
		}
		
	
	}

}
