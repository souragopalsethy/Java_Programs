package jun01;

import java.util.Scanner;

public class ze4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
	   int mid=(n/2)+1;
	   for(int i=1;i<=mid;i++)
	   {
		   for(int j=1;j<=mid-i;j++)
		   {
			   System.out.print(" ");
		   }
		   for(int k=1;k<=i;k++)
		   {
			   System.out.print(i+" ");
		   }
		   System.out.println();
	   }
	   for(int i=1;i<=mid-1;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(" ");
		   }
		   for(int k=mid-i;k>=1;k--)
		   {
			   System.out.print(k+" ");
		   }
		   System.out.println();
	   }
		// TODO Auto-generated method stub

	}

}
