package practise;

import java.util.Scanner;

public class prac14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valueof n");
		int n=sc.nextInt();
		int mid=(n/2)+1;
		
		for(int i=1;i<=n;i++)
		{
			int k=64+i;
			for(int j=1;j<=9;j++)
			{
				if(j>=(n+1)-i&&j<=(n-1)+i)
				{
					
					System.out.print((char)k);
					if(j<=mid)
						k++;
					else
						k--;
					
				}
				else
					System.out.print(" ");
			
				
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
