package packageone;

public class ThisKeywordEX {
	char a;
	String b;
	int c;

	void add(char a, String b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("out put " + a + " one " + b + " three " + c);
	}

	public static void main(String[] args) {
		ThisKeywordEX r = new ThisKeywordEX();
		r.add('f', "pooja", 24);
		System.out.println(r.a);
		System.out.println(r.b);
		System.out.println(r.c);

	}

}
