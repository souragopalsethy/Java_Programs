package Number_programs;

import java.util.Scanner;

public class prime_N0_1_n {

	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			int j;
			for( j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(j==i)
			{
				System.out.println(i);
			}
			
		}
		

	}

}
