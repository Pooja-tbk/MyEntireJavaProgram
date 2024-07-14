package packageone;


class College {
	College(String College_name) {
		System.out.println("College");
	}
}

class School extends College {
	School(int a, int b) {
		super("Pooja");// in parameterized constructor we have to call parent class explicitly
		System.out.println("School");
	}
}

public class SuperCallingStatement {// we have not created any relation with parent class

	public static void main(String[] args) {

	new School(2, 4);// child class object

	}

}
