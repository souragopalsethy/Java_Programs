package Imp;

import java.util.Scanner;

public class ArmStr_1_n_way2 {

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
        	
        	sum=sum+rev*rev*rev;
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
