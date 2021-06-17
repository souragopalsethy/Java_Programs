package paterns;

import java.util.Scanner;

public class down {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<=i;k++)
			System.out.print(" ");
			for(int j=0;j<n-i;j++)
				System.out.print("*");
			for(int l=0;l<n-i-1;l++)
				System.out.print("*");
			for(int m=0;m<=i;m++)
				System.out.print(" ");
			
			System.out.println();
		}

	}


}
