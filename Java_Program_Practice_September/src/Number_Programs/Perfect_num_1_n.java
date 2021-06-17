package Number_Programs;

import java.util.Scanner;

public class Perfect_num_1_n {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enete n");
		int a=sc.nextInt();
		 for(int n=1;n<a;n++)
		 {
			 int sum=0;
		   for(int i=1;i<=n/2;i++)
		   {
			   if(n%i==0)
			   {
				   sum=sum+i;
			   }
		   }
		   if(sum==n)
		   {
			   System.out.println(sum);
		   }
			
	     }
		
	}

}
