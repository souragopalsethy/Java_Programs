package Number_programs;

import java.util.Scanner;

public class Perfect_No_1_n {

	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		for(int n=1;n<a;n++)
		{
			int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		if(sum==n)
			System.out.println(n);
	}
	}
}
