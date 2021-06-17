package RightAroow;

import java.util.Scanner;

public class Final1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valueof n");
		int n=sc.nextInt();
		int x=n;
		int y=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

	}

}
