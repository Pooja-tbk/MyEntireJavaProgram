package assignment;

public class RandomMethod {

	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {
			System.out.println();
		
			double pi=Math.PI;
			System.out.println(pi);
			double r=Math.random();
			System.out.println(i+") Radius of circle : "+r);
			double a=pi*r*r;
			System.out.println("   Area of  circle is : "+a);
			

			}
	}

}
