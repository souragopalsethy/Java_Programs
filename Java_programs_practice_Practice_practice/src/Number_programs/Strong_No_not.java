package Number_programs;

import java.util.Scanner;

public class Strong_No_not {
	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		for(int n=1;n<=a;n++)
		{
		int sum=0;
		int temp=n;
		while(temp!=0)
		{
			int rev=temp%10;
			int fact=1;
			for(int i=1;i<=rev;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		
	
		if(sum==n)
			System.out.println(n);
	}
	}

}
