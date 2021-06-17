package Jun9th;

import java.util.Scanner;

public class Decimal_to_octakl {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enete the n");
		int n=sc.nextInt();
		int temp=n;
		String num="";
		while(temp!=0)
		{
		int rev=temp%8;
		num=num+rev;
		temp=temp/8;
		}
		System.out.println(num);
		// TODO Auto-generated method stub

	}

}
