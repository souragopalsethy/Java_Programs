package practise;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		//int a=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enete the value of n");
		int n=sc.nextInt();
		int p=1;
		for(int i=0;i<=n;i++)
		{
			
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2-1);k++)
			{
				System.out.print(p);
			}
			p=p+2;
		System.out.println();	
		}
		// TODO Auto-generated method stub

	}

}
