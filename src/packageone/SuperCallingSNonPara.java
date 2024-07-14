package packageone;

class Student {
	Student() {
		System.out.println("college");

	}
}

class Friends extends Student {
	Friends() {
		super();// in non parameterized constructor can call parent class explicitly also
		System.out.println("Friends");
	}
}

public class SuperCallingSNonPara extends Friends {
	SuperCallingSNonPara() {
		// implicitly super calling statement is there in 1st line

		System.out.println("SupercallingSNonParameter");
	}

	public static void main(String[] args) {

		new SuperCallingSNonPara();// child class object

	}
}

