package Imp;

import java.util.Scanner;

public class Mult_tab_biku {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			
		{
			int a=1;
			for(int j=1;j<=10;j++)
			{
			 System.out.print(" "+a+" * "+i+"="+a*i+" ");	
			 a++;
			
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
