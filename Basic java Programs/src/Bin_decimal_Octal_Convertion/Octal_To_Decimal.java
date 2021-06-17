package Bin_decimal_Octal_Convertion;

import java.util.Scanner;

public class Octal_To_Decimal {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enete the n");
		long n=sc.nextInt();
		 long temp=n;
		long sum=0;
		int mul=1;
		 while(temp!=0)
		 {
			 long rev=temp%10;
			 temp=temp/10;
			 sum=sum+rev*mul;
			 mul=mul*8;
			 
		 }
		 System.out.println(sum);
		// TODO Auto-generated method stub

	}

}


