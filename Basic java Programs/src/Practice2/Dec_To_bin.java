package Practice2;

import java.util.Scanner;

public class Dec_To_bin {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Binaray no ");
		int a=sc.nextInt();
		int temp=a;
		String num="";
		while(temp!=0)
		{
			int rev=temp%2;
			num=rev+num;
			temp=temp/2;
		}
		System.out.println("Decimal is--> "+num);
		// TODO Auto-generated method stub

	}

}
