package Imp;

import java.util.Scanner;

public class Strong_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        int rev=0;
        int sum=0;
        int temp =n;
       
        while(temp!=0)
        {
        	rev=temp%10;
        	
        	int fact=1;
            for(int i=rev;i>=2;i--)
            {
            	fact=fact*i;
            }
            //System.out.println(fact);
            sum=sum+fact;
            temp=temp/10;
        	
        }
        if(sum==n)
        System.out.println("String no");
        else
        	System.out.println("not Strong no");
        
       
		// TODO Auto-generated method stub

	}

}
