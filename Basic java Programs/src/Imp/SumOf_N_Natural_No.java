package Imp;

import java.util.Scanner;

public class SumOf_N_Natural_No {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		
	     int sum=0;
		for(int i=0;i<=n;i++)
	       {
			sum=sum+i;
	       }
	       System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
