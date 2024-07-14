package assignment;

interface Insta_v1{
	void story();
	void profile();
}
interface Insta_v2 extends Insta_v1
{
	void save();
	void post();
}
public class InterfaceAss implements Insta_v2,Insta_v1
	{
	void status(){
		System.out.println("upload video in status");
		
	}
	void chat() {
		System.out.println("send emoji");
	}
	public static void main(String[] args) {
		InterfaceAss n=new InterfaceAss();
		n.story();
		n.profile();
		n.save();
		n.post();
		n.status();
		n.chat();
		
	}
	public void story() {
		System.out.println("post picture");
	}
	public void profile() {
		System.out.println("view profile photo");	
	}
	public void save() {
		System.out.println("save post");
	}

	public void post() {
		System.out.println("post video");
		
	}

}