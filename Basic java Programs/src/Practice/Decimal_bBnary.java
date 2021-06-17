package Practice;

import java.util.Scanner;

public class Decimal_bBnary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the n");
		int n= sc.nextInt();
		int temp=n;
		int arr[] =new int[1000];
		int i=0;
		while(temp!=0)
		{
			int rev=temp%2;
			 arr[i]=rev;
			 i++;
			 temp=temp/2;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
		
		// TODO Auto-generated method stub

	}

}
