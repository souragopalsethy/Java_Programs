package Practice2;

import java.util.Scanner;

public class Strong_noi_n {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int a=sc.nextInt();
		for(int n=1;n<=a;n++)
		{
		int temp=n;
		int sum=0;
		while(temp!=0)
		{
		 int rev=temp%10;
		 int fact=1;
		 for (int i=1;i<=rev;i++)
		 {
			fact=fact*i; 
		 }
		 sum=sum+fact;
		 temp=temp/10;
		 
		}
		if(sum==n)
			System.out.println(n);
		}
		// TODO Auto-generated method stub

	}

}
