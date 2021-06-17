package Imp;

import java.util.Scanner;

public class Armstrong_Or_Not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int temp1=n;
		int temp2=n;
		int length=0;
		int sum=0;
	
		while(temp1!=0)
		{
			temp1=temp1/10;
			length++;
		}
		while(temp2!=0)
		{
			int rev=temp2%10;
			int mul=1;
			for(int i=1;i<=length;i++)
			{
				mul=mul*rev;
			}
			sum=sum+mul;
			temp2=temp2/10;
			
		}
		if(sum==n)
		System.out.println(sum+" is a arm strong");
		else
		{
			System.out.println("not arm strong");
		}
		// TODO Auto-generated method stub

	}

}
