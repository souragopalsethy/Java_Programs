package RightAngleTringle;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valueof n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=i)
				{
					System.out.print(j);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
