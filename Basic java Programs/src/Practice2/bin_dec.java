package Practice2;

import java.util.Scanner;

public class bin_dec {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int a=sc.nextInt();
		int temp=a;
		int mul=1;
		int sum=0;
		while(temp!=0)
		{
			int rev=temp%10;
			sum=sum+rev*mul;
			mul=mul*2;
			temp=temp/10;
			
	
		}
		System.out.println("decimal value of binary no "+a+" is = "+sum);
		// TODO Auto-generated method stub

	}

}
