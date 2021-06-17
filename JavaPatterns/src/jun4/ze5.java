package jun4;

import java.util.Scanner;

public class ze5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
				System.out.print("*");
				System.out.println();
			
		}
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
				System.out.print("*");
				System.out.println();
			
		}

		// TODO Auto-generated method stub

	}

}
