package packageone;

public class SQL_q {

	public static void main(String[] args) {
		String name="Janu";
		
	boolean nm=name.matches("(.*)a");
		System.out.println(nm);
		boolean nm1=name.matches("J(.*)");
		System.out.println(nm1);
		boolean nm2=name.matches("a...");
		System.out.println(nm2);
		boolean nm3=name.matches("...");
		System.out.println(nm3);
	}

}
