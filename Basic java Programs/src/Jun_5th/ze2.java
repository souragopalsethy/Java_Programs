package Jun_5th;

import java.util.Scanner;

public class ze2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		boolean b=true;
		int i;
		for(int k=1;k<=n;k++)
		{
		for(i=2;i<k;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(k==i)
		{
			System.out.println(i);
		}
		else
			System.out.println();
		// TODO Auto-generated method stub

	}
	}

}
