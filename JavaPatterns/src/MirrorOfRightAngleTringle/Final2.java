package MirrorOfRightAngleTringle;

import java.util.Scanner;

public class Final2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
				
			}
			for(int j=0;j<=n-i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
