package Practice2;

import java.util.Scanner;

public class prime_palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int a=sc.nextInt();
		//int temp=a;
		for(int n=1;n<=a;n++)
		{
		int i;
		for( i=2;i<n;i++)
		{
			if(n%i==0)
				break;
		}
		if(i==n)
		{
			int temp=n;
			int rev=0;
			while(temp!=0)
			{
				rev=rev*10+temp%10;
				temp=temp/10;
			}
			if(n==rev)
				System.out.println(n);
		}
	}
		// TODO Auto-generated method stub

	}

}
