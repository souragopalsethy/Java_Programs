package patterns;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=1;
			int b=1+i;
			for(int j=0;j<=i;j++)
			{
		     System.out.print(a);
		     a++;
			}
			for(int k=0;k<n-i;k++)
			{
				System.out.print(" ");
			}
			for(int l=0;l<n-i;l++)
			{
				System.out.print(" ");
			}
			for(int m=0;m<=i;m++)
			{
				System.out.print(b);
				b--;
			}
			System.out.println();
			
		}
		
		// TODO Auto-generated method stub

	}

}
