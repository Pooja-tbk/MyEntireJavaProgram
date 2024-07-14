package encapsulation;

class flipkart {

	int age = 23;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		this.age = age;

	}
}

public class Encapsulation_two {

	public static void main(String[] args) {

		flipkart n = new flipkart();
		n.setAge(27);
		System.out.println(n.getAge());

	}

}
