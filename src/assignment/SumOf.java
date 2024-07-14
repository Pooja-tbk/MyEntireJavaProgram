package assignment;


public class SumOf {
	static int sum=0;

	public static void main(String[] args) {
		int num[]=new int[4];
		num[0]=1;
		num[1]=4;
		num[2]=6;
		num[3]=2;
		
		for(int i=0;i<4;i++)
		{
			sum=sum+num[i];
		}
		System.out.println(sum);
	}
		
		

	}
