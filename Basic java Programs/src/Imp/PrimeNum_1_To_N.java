package Imp;

import java.util.Scanner;

public class PrimeNum_1_To_N {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		if(n==1)
		
			System.out.println("Sorry 1 is a natural no");
		int i;
		int j;
		for(i=1;i<=n;i++)
		{
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
				break;
			}
		}
		if(j==i)
		{
			System.out.print(i+" , ");
		}
		
		// TODO Auto-generated method stub

	}
	}

}
