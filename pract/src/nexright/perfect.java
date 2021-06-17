package nexright;

import java.util.Scanner;

public class perfect {
	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int p=1;
		for(int n=1;n<=a;n++)
		{
			int sum=0;
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
			}
			if (sum==n)
			{
				System.out.println((p++)+" ."+n);
			}
		}
		
	}

}
