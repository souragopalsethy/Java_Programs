package Imp;

import java.util.Scanner;

public class Binary_To_Decimal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enete the n");
		int n=sc.nextInt();
		 int temp=n;
		int sum=0;
		int mul=1;
		 while(temp!=0)
		 {
			 int rev=temp%10;
			 temp=temp/10;
			 sum=sum+rev*mul;
			 mul=mul*2;
			 
		 }
		 System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
