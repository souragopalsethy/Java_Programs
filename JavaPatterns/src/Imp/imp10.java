package Imp;

import java.util.Scanner;

public class imp10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
	   int mid=(n/2)+1;
	   int alpha=64;
	   int second=67;
	  
	   for(int i=1;i<=mid;i++)
	   {
		   int alpha1=alpha;
		  
		   for(int j=1;j<=mid-i;j++)
		   {
			   System.out.print(" ");
		   }
		   for(int k=1;k<=i;k++)
		   {
			   System.out.print((char)(alpha1+k)+" ");
			 
		   }
		   System.out.println();
		   
		   ++second;
	   }
	  
	   for(int i=1;i<=mid;i++)
	   {    int bita=second-i;
		   for(int j=1;j<i;j++)
		   {
			   System.out.print(" ");
		   }
		   for(int k=1;k<=mid-i+1;k++)
		   {
			   System.out.print((char)(bita-k)+" ");
		   }
		   System.out.println();
	   }
		// TODO Auto-generated method stub

	}

}
