package RightAngleTringle;

import java.util.Scanner;

public class demo6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valueof n");
		int n=sc.nextInt();
		int k=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				k++;
				if(i>=j)
				{
					System.out.print(" "+k);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
