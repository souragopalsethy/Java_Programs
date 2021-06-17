package Piramid;

import java.util.Scanner;

public class FinalTringle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valueof n");
		int n=sc.nextInt();
		int x=n;
		int y=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n;j++)
			{
				if(j>=x && j<=y)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			x--;
			y++;
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
