package Imp;

import java.util.Scanner;

public class ArmSrong_No_1_to_n {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ennetere the n");
		int a= sc.nextInt();
	for( int n=1;n<=a;n++)
	{
		int temp1=n;
		int temp2=n;
		int length=0;
		int sum=0;
		while(temp1!=0)
		{
			temp1=temp1/10;
			length++;
			
		}
		//System.out.println("Length is"+length);
		
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
		{
			System.out.println(sum);
		}
		
		
		// TODO Auto-generated method stub

	}
	}

}
