package assignment;

public class AreaOfCircle_CircumferenceCircle{
	
	static void Area()
	{
		int r=12;
		final double pi=3.14;
		double c=2*pi*r;
		System.out.println("Area of Circle : "+c);	
	}
	void circumference()
	{
		int r=10;
		final double pi=3.14;
		double a=pi*r*r;
		System.out.println("Area of Circumference : "+a);
	}

	public static void main(String[] args) {
		AreaOfCircle_CircumferenceCircle n1=new AreaOfCircle_CircumferenceCircle();
		Area();
		n1.circumference();
	}

}