package packageone;

public class ThisKeyword {
	int age;
	String name;
	double salary;

	void add(int age, String name, double salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		System.out.println("age : " + age + " name : " + name + " salary : " + salary);
	}

	public static void main(String[] args) {
		ThisKeyword n = new ThisKeyword();
		n.add(24, "Sita", 40.40);
		System.out.println(n.age);
		System.out.println(n.name);
		System.out.println(n.salary);

	}

}
