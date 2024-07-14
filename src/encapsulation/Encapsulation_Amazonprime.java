package encapsulation;

class Amazonprime {
	String un = "Contact@growtech@gmail.com";

	public String getUn() {
		return un;

	}

	public void setUn(String un) {
		this.un = un;

	}

}

public class Encapsulation_Amazonprime {

	public static void main(String[] args) {
		Amazonprime n = new Amazonprime();
		n.setUn("stwbyt99@gmail.com");
		System.out.println(n.getUn());

	}

}
