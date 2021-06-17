package jun_8;

import java.util.Scanner;

public class Prime_palinrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
		if(n==1)
		
			System.out.println("Sorry 1 is a natural no");
		int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(i==n)
		{
			
			 int temp=n;
		        int rev=0;
		        while(temp!=0)
		        {
		        	rev=rev*10+temp%10;
		        	temp=temp/10;
		        }
		        if(rev==n)
		        {
		        	System.out.println("Prime palindrome");
		        }
		        
			
		}
		 else
	        	System.out.println("Not Palindrome no");
		// TODO Auto-generated method stub

	}

}
