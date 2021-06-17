package jun4;

import java.util.Scanner;

public class ze7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int x=n;
		int y=n*2-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if(j<=x&&y<=j)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			x++;
			y--;
		}
		// TODO Auto-generated method stub

	}

}
