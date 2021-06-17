package practise;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n");
		int n=sc.nextInt();
	

		for(int i=0;i<=n;i++)
		{
			int a=i;
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(n*2+1)-i*2;k++)
			{
				if(k<=(((n*2+1)-i*2)/2)+1)
						a++;
				else
					a--;
				System.out.print(a);
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
