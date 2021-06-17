package Practice2;

import java.util.Scanner;

public class Prime_1_n {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int a=sc.nextInt();
		int sum=0;
		for(int n=2;n<=a;n++)
		{
		int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
				break;
		}
		if(i==n)
		{
			System.out.println(n);
			sum=sum+n;
		}
		}
		System.out.println("Sum of 1 to "+a+" prime no is "+sum);
		// TODO Auto-generated method stub

	}

}
