package practise;

import java.util.Scanner;

public class prac8 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the n");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=n-i;k++)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
		// TODO Auto-generated method stub

	}

}
