package Ptterns;
import java.util.*;

public class demo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j==0||i==j||i+j==n-1||j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
