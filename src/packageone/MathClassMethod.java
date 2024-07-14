package packageone;

public class MathClassMethod {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		double pi = Math.PI;
		System.out.println(pi);
		System.out.println(Math.addExact(12345, 12345));
		System.out.println(Math.addExact(233456678, 324567780));
		System.out.println(Math.subtractExact(300, 200));
		System.out.println(Math.multiplyExact(23, 25));
		System.out.println(Math.sqrt(100));// square root of 100
		System.out.println(Math.max(45, 50));// maximum value
		System.out.println(Math.min(3, 4));// minimum value
		System.out.println(Math.random());
		/*for (int i = 0; i < 10; i++) {
			System.out.println(Math.random(i));
		}*/
	}
	static void add()
	{
		double pi=Math.random();
		double r=Math.random();
		double area=pi*r*r;
	}

	}

