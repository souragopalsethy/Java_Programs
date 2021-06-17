package Pattern_interview;

import java.util.Scanner;

public class flotri {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter n");
		int n=sc.nextInt();
		int temp=1;
		for(int i=1;i<=n;i++)
		{
		
			for(int j=1;j<=n;j++)
			{
				if(j<=i)
				{
					System.out.print(temp);
				temp++;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
