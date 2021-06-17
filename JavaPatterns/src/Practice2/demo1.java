package Practice2;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the n");
		int temp=sc.nextInt();
		int n=temp/2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
				System.out.print("*");
			for(int k=0;k<=i;k++)
				System.out.print(" ");
			for(int l=0;l<=i;l++)
				System.out.print(" ");
			for(int m=0;m<n-i;m++)
				System.out.print("*");	
			System.out.println();
		
		}
		for(int i=0;i<n;i++)
		{
			for(int o=0;o<=i;o++)
				System.out.print("*");
			for(int p=0;p<n-i;p++)
				System.out.print(" ");
			for(int q=0;q<n-i;q++)
				System.out.print(" ");
			for(int r=0;r<=i;r++)
				System.out.print("*");
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
