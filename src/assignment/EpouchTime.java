package assignment;


import java.util.Date;

public class EpouchTime {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.toString());
		Date d2=new Date(d1.getTime()+(60*60*1000*24*8));
		System.out.println(d2);
	

	}

}
