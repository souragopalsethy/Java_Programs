package Piramid;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the valueof row");
		int row=sc.nextInt();
		System.out.println("Enter the value of column");
		int column=sc.nextInt();
		
		
		for(int i=1;i<=row;i++)
		{
		
			for(int j=1;j<=column;j++)
			{
				if(j>=i&&j<=(column+1)-i)
				{
					
					System.out.print("*");
					
					
				}
				else
					System.out.print(" ");
			
				
			}
			System.out.println();
		}

		// TODO Auto-generated method stub

	}

}
