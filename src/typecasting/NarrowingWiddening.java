package typecasting;

public class NarrowingWiddening {

	public static void main(String[] args) {
		double a=90;
		System.out.println(a);
		
		int age=18;
		double ageoft=age;
		System.out.println(ageoft);//widdening implivy explicitly
		
		double agetr=80.00;
		int agetp=(int)agetr;
		System.out.println(agetp);//narrowing explicitly
		
		int ager=90;
		double ageofperson=ager;
		System.out.println(ageofperson);//primitive typecasting >widdening
		
		//explicitly
		
		double ageofperson1=(double)ageofperson;
		System.out.println(ageofperson1);//narrowing
		
		

	}

}

