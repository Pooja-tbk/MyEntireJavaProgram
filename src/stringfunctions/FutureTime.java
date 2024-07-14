package stringfunctions;

import java.util.Date;

public class FutureTime {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());//current date in 
		Date d2=new Date(d1.getTime()+(60*60*1000*24*2));// to get get human time//*(60*60*1000*24*1));
		System.out.println(d2);
	
	}

}
