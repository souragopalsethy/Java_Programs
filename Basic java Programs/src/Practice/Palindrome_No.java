package Practice;

import java.util.Scanner;

public class Palindrome_No {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        int count=1;
       for(int i=1;i<=n;i++)
       {
        int temp=i;
        int rev=0;
        while(temp!=0)
        {
        	rev=rev*10+temp%10;
        	temp=temp/10;
        }
        if(i==rev)
        {
        System.out.println(count+". "+i);
        count++;
        }
		// TODO Auto-generated method stub

	}
	}

}
