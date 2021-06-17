package Practice2;

import java.util.Scanner;

public class Palindrome_1_n {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int a=sc.nextInt();
		for(int n=1;n<=a;n++)
		{
		int temp=n;
		int rev=0;
		while(temp!=0)
		{
			rev=rev*10+temp%10;
			temp=temp/10;
			
		}
		if(rev==n)
		System.out.println(n);
		}
		
		// TODO Auto-generated method stub

	}

}
