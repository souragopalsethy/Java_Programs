package Imp;

import java.util.Scanner;

public class Fact_no_1_To_N {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
             long fact=1;
           for(int j=i;j>=2;j--)
           {
        	   fact=fact*j;
           }
           System.out.println(fact);
        }
		// TODO Auto-generated method stub

	}

}
