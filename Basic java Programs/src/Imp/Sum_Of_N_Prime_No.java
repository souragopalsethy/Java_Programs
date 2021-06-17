package Imp;

import java.util.Scanner;

public class Sum_Of_N_Prime_No {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int sum=0;
		int count=0;
		if(n==1)
		
			System.out.println("Sorry 1 is a natural no");
		int i;
		int j;
		for(i=1;i<=n;i++)
		{
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
				break;
			}
		}
		if(j==i)
		{
			System.out.print(i+" , ");
			sum=sum+i;
			count++;
		}
		
		// TODO Auto-generated method stub

	}
		System.out.println();//i used this for new line 
		System.out.println("Total sum of prime no bettwen 1 to "+n+" is "+sum);
		System.out.println("Total prime no are-> "+count);

}
}