package nexright;

import java.util.Scanner;

public class strong {
	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		
		int temp=a;
		while(temp!=0)
		{
			int last=temp%10;
			
			int fact=1;
			for(int i=1;i<=last;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		 if(sum==a)
			 System.out.println("strong");
	}

}
