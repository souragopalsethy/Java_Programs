package Bin_decimal_Octal_Convertion;

import java.util.Scanner;

public class Octal_To_Decimal_Way_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the n");
		int n=sc.nextInt();
		 int temp=n;
		 String num="";
		
		 while (temp!=0)
		 {
			 int rev=temp%8;
			 num=rev+num;
			 temp=temp/8;
			 
		 }
		 System.out.println(num);
		// TODO Auto-generated method stub

	}

}
