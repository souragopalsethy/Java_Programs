package Imp;

import java.util.Scanner;

public class Palindrome_No {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
       
        int temp=n;
        int rev=0;
        while(temp!=0)
        {
        	rev=rev*10+temp%10;
        	temp=temp/10;
        }
        System.out.println(rev);
		// TODO Auto-generated method stub

	}

}
