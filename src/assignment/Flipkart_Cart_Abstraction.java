package assignment;

class Flipkart_auth {		//concrete class
	void sign_up_email()	//concrete method
	{
		System.out.println("sign in using email");
	}

	void sign_up_mob() 	//concrete method
	{
		System.out.println("sign in using mobile");
	}
}
abstract class Flipkart_update extends Flipkart_auth //abstract class
	{
	abstract void login_username();//abstract method
	abstract void login_passward();//abstract method
	void login_emailid() 	//concrete method
	{
		System.out.println("Login using email id");
	}
	void Home_page() //concrete method
	{
		System.out.println("login successfully");
	}
}

public class Flipkart_Cart_Abstraction extends Flipkart_update //concrete class
	{
	void add_cart() //concrete method
	{
		System.out.println("product added to cart");
	}

	void add_cart_more()//concrete method
	{
		System.out.println("one more product added to cart");
	}

	public static void main(String[] args) {
		Flipkart_Cart_Abstraction n1 = new Flipkart_Cart_Abstraction();
		n1.sign_up_email();
		n1.sign_up_mob();
		n1.login_username();
		n1.login_passward();
		n1.login_emailid();
		n1.Home_page();
		n1.add_cart();
		n1.add_cart_more();
	
	}

	void login_username()//abstract method overridden in child class
	{
		System.out.println("entre username");	
	}

	void login_passward() //abstract method overridden in child class
	{
		System.out.println("enter password");
		
	}

}
