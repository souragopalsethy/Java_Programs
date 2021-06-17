package Number_programs;

import java.util.Scanner;

public class prime_palindrome {

	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		for(int n=2;n<=a;n++)
		{
		int i;
		for( i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(n==i)
		{
			int temp=n;
			int rev=0;
			while(temp!=0)
			{
				 rev=rev*10+temp%10;
				 temp=temp/10;
			}
			if(rev==n)
				System.out.println(n);
		}

	}
	}

}
