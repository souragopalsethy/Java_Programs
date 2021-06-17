package Patterns;

import java.util.Scanner;

public class RightAngle_abc {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			char alpha='a';
		  for(int j=0;j<=i;j++)
		  {
			  System.out.print(alpha);
			  alpha++;
		  }
		  
		  for(int k=i;k<=n;k++)
			  System.out.print(" ");
		  System.out.println();
		}
		
	}

}
