package assertkeyword;

public class AssertionInArray {



		public static void main(String[] args) {
			String name[]=new String[4];
			name[0]="Sita";
			name[1]="Ram";
			name[2]="Laskshmi";
			name[3]="Janki";
			
			assert name[0]=="Sita";
			
			
			
			for(int i=0;i<name.length;i++) {
			
			System.out.println(name[i]);
		}

	}

}
