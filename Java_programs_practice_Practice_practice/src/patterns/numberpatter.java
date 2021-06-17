package patterns;

import java.util.Scanner;

public class numberpatter {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter n");
		int n= sc.nextInt();
		int i=0;
		for(i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
			
			if(i==0||j==0||i==n-1||j==n-1&&i>=n/2||i==n/2&&j>=n/2)
				System.out.print("a");
			else
				System.out.print(" ");
				}
			System.out.println();
		}
		
		

	}

}
