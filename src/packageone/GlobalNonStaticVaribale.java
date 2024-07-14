package packageone;

public class GlobalNonStaticVaribale {
	String name = "Pooja";
	int age = 20;
	double percentage = 85.05;

	public static void main(String[] args) {

		GlobalNonStaticVaribale n = new GlobalNonStaticVaribale();
		System.out.println(n.name);// default value of String
		System.out.println(n.age);// default value of int
		System.out.println(n.percentage);// default value of double

		n.name = "Sita";
		n.age = 21;
		n.percentage = 8.623;
		System.out.println("Name: " + n.name + "  " + "age: " + n.age + "  " + "Percentage: " + n.percentage);

	}

}