package Practice;

import java.util.Scanner;

public class prime_fact {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter n");
		int a=sc.nextInt();
		for(int n=2;n<=a;n++)
		{
		int i;
		int count=0;
		
		for(i=1;i<=n;i++)
		{
		 if(n%i==0)
		 count++;
		}
		if(count==2)
		{
			int temp=n;
			int fact=1;
			for(int j=1;j<=temp;j++)
			{
				fact=fact*j;
			}
			System.out.println(n+"is a prime no  and its fact "+fact);
		}
		
		// TODO Auto-generated method stub

	}
	}

}
