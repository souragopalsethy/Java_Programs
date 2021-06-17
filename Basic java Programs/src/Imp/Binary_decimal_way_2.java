package Imp;

import java.util.Scanner;

public class Binary_decimal_way_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the bin-");
		long n=sc.nextInt();
		long temp=n;
		
		long sum=0;
		int count=0;
		while(temp!=0)
		{
			long rev=temp%10;
			sum= (long)(sum+rev*Math.pow(2, count));
			count++;
			temp=temp/10;
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
