package Number_Programs;

import java.util.Scanner;

public class Binary_Decimal {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Binary num");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int sqr=1;
		while(temp!=0)
		{
		int last=temp%10;
		int element=last*sqr;
		sum=sum+element;
		sqr=sqr*2;
		temp=temp/10;
		}
		System.out.println(sum);
	}

}
