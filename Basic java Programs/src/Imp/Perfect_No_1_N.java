package Imp;

import java.util.Scanner;

public class Perfect_No_1_N {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        int count2=0;
        int count1=0;
        for(int a=1;a<=n;a++)
        {
        int sum=0;
        for(int i=1;i<=a/2;i++)
        {
        	if(a%i==0)
        	{
        		//System.out.println(i);
        		sum=sum+i;
        	}
        }
        if(sum==a)
        {
        	count1++;
        	System.out.println(count1+". "+a);
        }
        else
        	count2++;
        	
		// TODO Auto-generated method stub

	}
        System.out.println("The no of not strong no between 1 to "+n+" is "+count2);
	}

}
