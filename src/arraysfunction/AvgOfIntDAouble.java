package arraysfunction;


	/*create two array one of int data type and one double data type both of size 4
	calculate the avg of all the 8 values*/


	public class AvgOfIntDAouble {
		static int sumofint=0;
		static double sumofdouble=0;
		static double sumoflegnth;
		static double sumofboth;
		static double avg;
		static double remainder;
		

		public static void main(String[] args) {
			
			int rollnum[]=new int[4];
			rollnum[0]=4;
			rollnum[1]=2;
			rollnum[2]=4;
			rollnum[3]=3;//13
			
			double percent[]=new double[4];
			percent[0]=14.0;
			percent[1]=12.01;
			percent[2]=14.30;
			percent[3]=13.67;//
			
			for(int i=0;i<rollnum.length;i++)
			{
				sumofint=sumofint+rollnum[i];
			}
			System.out.println("Sum of int : "+sumofint);//13
			
			for(int i=0;i<percent.length;i++)
			{
				sumofdouble=sumofdouble+percent[i];
			}
			System.out.println("sum of double : "+sumofdouble);//53.98
			
			sumoflegnth=(rollnum.length)+(percent.length);
			System.out.println("Total length of both the Arrays : "+sumoflegnth);//66.98
			
			sumofboth=sumofint+sumofdouble;
			System.out.println("Total sum of both the Arrays : "+sumofboth);
			
			avg=sumofboth/sumoflegnth;
			System.out.println("Average of both the Arrays : "+avg);
			
			remainder=sumofboth%sumoflegnth;
			
			System.out.println("Remaindee of both Arrays : "+remainder);

		}

}
