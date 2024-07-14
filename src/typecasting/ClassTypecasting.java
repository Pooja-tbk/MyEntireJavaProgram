package typecasting;

class parentclass{
	
}

public class ClassTypecasting extends parentclass{

	public static void main(String[] args) {
		parentclass per=new ClassTypecasting();//create object for child class of type parent class
		System.out.println(per);// upcasting
		
		ClassTypecasting as=(ClassTypecasting)per;
		System.out.println(as);
		
		

	}

}