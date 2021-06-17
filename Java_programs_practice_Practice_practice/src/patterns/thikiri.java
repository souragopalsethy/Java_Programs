package patterns;

import java.util.Scanner;

public class thikiri {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter n");
		int n= sc.nextInt();
		int a=1;
		for(int i=0;i<n;i++)
		{
			int p=a;
			for(int j=0;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(i+1);
			
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print(i+1);
			}
			System.out.println();
		
		}
		int temp=n;
		for(int i=1;i<n;i++)
		{
			int vtemp=temp;
			for(int j=0;j<=i+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
				vtemp--;
			
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print(i);
			}
			System.out.println();
		
		}
		
		
		// TODO Auto-generated method stub

	}

}
