package typecasting;

class ParentClassOne{
	
	
}

public class UpcastingDowncasting extends ParentClassOne {

	public static void main(String[] args) {
		ParentClassOne up=new UpcastingDowncasting();
		System.out.println(up);
		
		UpcastingDowncasting dn=(UpcastingDowncasting)up;
		System.out.println(dn);
		
	}

}

