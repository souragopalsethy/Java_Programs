package Number_Programs;

import java.util.Scanner;

public class Strong_No_1_n {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enete n");
		int a=sc.nextInt();
		for(int n=1;n<=a;n++)
		{
			int temp=n;
		     int sum=0;
			while(temp!=0)
			{
				int fact=1;
				int rev=temp%10;
				for(int i=1;i<=rev;i++)
				{
					fact=fact*i;
				}
				temp=temp/10;
				sum=sum+fact;
				
			}
			if(sum==n)
			{
				System.out.println(n);
			}
			
		}
		
	}

}
