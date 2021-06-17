package Practice2;

import java.util.Scanner;

public class factorial_of_no_1_to_n {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int a=sc.nextInt();
		for(int n=1;n<=a;n++)
		{
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println("fact of "+n +" is"+fact);
		}
		// TODO Auto-generated method stub

	}

}
