package Practice2;

import java.util.Scanner;

public class Arm_1_n {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int a=sc.nextInt();
		for(int n=1;n<=a;n++)
		{
		int temp1=n;
		int temp2=n;
		int count=0;
		int sum=0;
		while(temp1!=0)
		{
			count++;
			temp1=temp1/10;
		}
		while(temp2!=0)
		{
			int rev=temp2%10;
			int mul=1;
			for(int i=1;i<=count;i++)
			{
				mul=mul*rev;
			}
			sum=sum+mul;
			temp2=temp2/10;
			
		}
		if(sum==n)
			System.out.println(sum);
		// TODO Auto-generated method stub

	}
	}

}
