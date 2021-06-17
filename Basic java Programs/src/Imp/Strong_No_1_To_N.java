package Imp;

import java.util.Scanner;

public class Strong_No_1_To_N {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        for(int a=1;a<=n;a++)
        {
        int temp=a;
        int sum=0;
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
        //System.out.println(sum);
        if(a==sum)
        {
        	System.out.println(sum);
        }
        
        
        }
		// TODO Auto-generated method stub

	}

}
