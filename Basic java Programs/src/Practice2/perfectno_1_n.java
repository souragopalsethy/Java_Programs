package Practice2;

import java.util.Scanner;

public class perfectno_1_n {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int a=sc.nextInt();
		//int sum=0;
		for(int n=1;n<=a;n++)
		{
			int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		if(n==sum)
			System.out.println(sum);
		}
		// TODO Auto-generated method stub

	}


}
