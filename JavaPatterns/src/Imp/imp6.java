package Imp;

import java.util.Scanner;

public class imp6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n");
		int n=sc.nextInt();
		int a=65;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print((char)a);
			}
			a=a+2;
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
