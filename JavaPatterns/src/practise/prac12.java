package practise;

import java.util.Scanner;

public class prac12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n");
		int n=sc.nextInt();
		int a=64;
		int mid=(n+1)/2;
		for(int i=1;i<=n;i++)
		{
			a++;
			int b=a;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print((char)b);
				if(k<=mid+1)
				{
					b=b-1;
				}
				
				else
				{
					
					b=b+1;
				}
			//System.out.print((char)b);
			}
			System.out.println();
		
		
		}
		
		// TODO Auto-generated method stub

	}

}
