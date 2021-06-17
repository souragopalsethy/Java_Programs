package Practice;

import java.util.Scanner;

public class Bin_dec {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the bin-");
		int n=sc.nextInt();
		int temp=n;
		int mul=1;
		int sum=0;
		while(temp!=0)
		{
			int rev=temp%10;
			sum=sum+rev*mul;
			mul=mul*2;
			temp=temp/10;
			
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
