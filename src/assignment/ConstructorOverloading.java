package assignment;

public class ConstructorOverloading {

	
	ConstructorOverloading()//all method has same variation in argument
	{
		System.out.println("first");
	}
	ConstructorOverloading(int a,int b,int c,int d,int e,int f,int g)
	{
		System.out.println("value: "+(a+b+c+d+e+f+g));
	}
	ConstructorOverloading(double a)
	{
		System.out.println("third");
	}
	ConstructorOverloading(int c,double d)
	{
		System.out.println("fourth");
	}
	ConstructorOverloading(char e,String f)
	{
		System.out.println("sixth");
	}
	ConstructorOverloading(int e,String f)
	{
		System.out.println("last");
	}
	public static void main(String[] args) {
		new ConstructorOverloading();
		new ConstructorOverloading(2,2,5,5,9,7,8);
		new ConstructorOverloading(3.14);
		new ConstructorOverloading(3,4.1);
		new ConstructorOverloading('A',"word");
		new ConstructorOverloading(3,"world");
			
	}

}

