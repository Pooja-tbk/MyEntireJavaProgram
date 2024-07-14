package encapsulation;


class flip_kart {

	int age = 23;
	String une = "Contact@growtech@gmail.com";
	String pwd = "growtech+_)";

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		this.age = age;
	}

	public String getUne() {
		return une;
	}

	public void setUn(String une) {

		this.une = une;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {

		this.pwd = pwd;
	}
}
public class Encapsulation_three {

	public static void main(String[] args) {
	

			flip_kart n = new flip_kart();
			n.setAge(27);
			n.setUn("SWT@gmail.com");
			n.setPwd("GTRMLR@7485");
			System.out.println(n.getAge());
			System.out.println(n.getUne());
			System.out.println(n.getPwd());

		

	}

}
