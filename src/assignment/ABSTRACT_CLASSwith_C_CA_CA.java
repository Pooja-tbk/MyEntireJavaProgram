package assignment;

abstract class abst_Class1{
	abstract void add();
}

abstract class abst_Class2 extends abst_Class1{
	abstract void sub();
}



public class ABSTRACT_CLASSwith_C_CA_CA extends abst_Class2 {
	void mul()
	{
		System.out.println("Concrete class");
	}

	public static void main(String[] args) {
		ABSTRACT_CLASSwith_C_CA_CA n=new ABSTRACT_CLASSwith_C_CA_CA();
		n.add();
		n.sub();
		n.mul();
	}
	void add() {
		System.out.println("abstract class one");
	}

	void sub() {
		System.out.println("abstract class two");
		
	}
}
