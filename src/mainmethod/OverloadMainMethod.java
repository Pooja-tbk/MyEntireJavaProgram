package mainmethod;

//can we overload main method
//yes we can overload main method but argument list should be different

public class OverloadMainMethod {

	public static void main(String[] args) {
		System.out.println("1");
	
	}
		
		public static void main()
		{
			System.out.println("2");
		}
		public static void main(int a)
		{
			System.out.println("2");
			
		}

		public static void main(double b)
		{
			System.out.println("3");
		
			
		}
	}


