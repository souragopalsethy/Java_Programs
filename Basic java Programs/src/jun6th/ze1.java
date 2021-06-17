package jun6th;

import java.util.Scanner;

public class ze1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int j=1;j<=n;j++)
			{
		int sum=1;
		for(int i=2;i<=j/2;i++)
		{
			if(j%i==0)
			{
				
				sum=sum+i;
			}
		}
		if(j==sum)
		{
			System.out.println(j);
		}
		
		// TODO Auto-generated method stub

	}
	}

}
