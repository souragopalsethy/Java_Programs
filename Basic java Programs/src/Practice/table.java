package Practice;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int i;
		int j;
		for( i=1;i<=10;i++)
		{
			for( j=1;j<=n;j++)
			{
				System.out.print(j+"*"+i+"="+j*i+"  ");
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
