package Piramid;

import java.util.Scanner;

public class Demo4 {

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
				if((j>=(row+1)-i)&&(j<=(column-2)-i))
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
