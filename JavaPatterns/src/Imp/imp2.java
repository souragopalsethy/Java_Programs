package Imp;

import java.util.Scanner;

public class imp2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valueof n");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{  int k=1;
			for(int j=1;j<=i;j++)
			{
				
				if(i>=j &&j%2!=0)
				{
					System.out.print(k);
					k++;
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
