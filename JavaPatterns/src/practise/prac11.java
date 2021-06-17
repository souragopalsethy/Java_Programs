package practise;

import java.util.Scanner;

public class prac11 {

	public static void main(String[] args) {
		int a=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enete the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i<(n/2)+1)
			{
				for(int j=1;j<=a;j++)
				{
					System.out.print("*");
					
				}
				a++;
			System.out.println();
			}
			else
			{
				for(int k=1;k<=a;k++)
				{
					System.out.print("*");
					
				}
				a--;
				System.out.println();
			}
		}
		// TODO Auto-generated method stub

	}

}
