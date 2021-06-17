package Practice;

import java.util.Scanner;

public class Decimal_To_Octal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the n");
		int n=sc.nextInt();
		 int temp=n;
		 int arr[]=new int[n];
		 int i=0;
		 while (temp!=0)
		 {
			 int rev=temp%8;
			 arr[i]=rev;
			 i++;
			 temp=temp/8;
			 
		 }
		 for(int j=i-1;j>=0;j--)
		 {
			 System.out.print(arr[j]);
		 }
		// TODO Auto-generated method stub

	}

}
