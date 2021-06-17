package Practice;

import java.util.Scanner;

public class Decimal_Binary_way_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the n");
		int n=sc.nextInt();
		 int temp=n;
		 String num="";
		 while(temp!=0)
		 {
			 int rev= temp%2;
			 num= rev+num;
			 temp=temp/2;
		 }
		 System.out.println(num);

		// TODO Auto-generated method stub

	}

}
