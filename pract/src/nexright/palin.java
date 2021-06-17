package nexright;

import java.util.Scanner;

public class palin {
	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		Scanner sc= new Scanner(System.in);
		int rev=0;
		
		int a=sc.nextInt();
		int temp=a;
		//int rev=0;
		while(temp!=0) {
			rev=rev*10+temp%10;
			temp=temp/10;
			
		}
		if(rev==a) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not");
		}
		
	}

}
