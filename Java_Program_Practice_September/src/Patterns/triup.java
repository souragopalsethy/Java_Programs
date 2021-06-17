package Patterns;

import java.util.Scanner;

public class triup {

		public static void main(String[] args) {
			
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			  for(int k=0;k<=i;k++)
				  System.out.print(" ");
			char alpha='a';
		  for(int j=i;j<n;j++)
		  {
			  System.out.print("*"+" ");
			  alpha++;
		  }
		  
		  System.out.println();
		}
		
	

		
		}
	

}
