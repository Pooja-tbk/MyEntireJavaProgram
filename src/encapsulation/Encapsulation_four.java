package encapsulation;


class En_otp{
	private int otp=123;
	
	public int getOtp() {
		return otp;
	}
	
	public void setOtp(int otp) {
		this.otp=otp;
	}
}
public class Encapsulation_four {

	public static void main(String[] args) {
		En_otp e=new En_otp();
		e.setOtp(234);
		System.out.println(e.getOtp());

	}

}
