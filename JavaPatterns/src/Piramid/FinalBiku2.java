package Piramid;

import java.util.Scanner;

public class FinalBiku2 {

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
			for(int k=1;k<=(n*2+1)-i*2;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	
		// TODO Auto-generated method stub

	}

}
