package Imp;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		if(n==1)
		
			System.out.println("Sorry 1 is a natural no");
		int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(i==n)
		{
			System.out.println(n+" is  prime");
		}
		else
			System.out.println(n+" is  not prime no");
		// TODO Auto-generated method stub

	}

}
