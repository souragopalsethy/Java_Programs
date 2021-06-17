package patterns;

import java.util.Scanner;

public class Thikiri_java_easy_2 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter n");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print(i+" ");
			System.out.println();
		}
		int temp=n;
		for(int i=1;i<=n;i++)
		{ int temp2=temp-i;
			for(int k=1;k<=i;k++)
				System.out.print(" ");
			for(int j=1;j<=n-i;j++)
				System.out.print(temp2--+" ");
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
