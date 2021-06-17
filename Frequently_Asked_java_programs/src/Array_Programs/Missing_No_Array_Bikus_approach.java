package Array_Programs;

import java.util.HashSet;
import java.util.Scanner;

public class Missing_No_Array_Bikus_approach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elemnt u weant to add ");
		int n= sc.nextInt();
		System.out.println("entyer the range of elemnt");
		int range=sc.nextInt();
		HashSet hs= new HashSet(n);
		for(int i=0;i<n;i++)// first for loop for inserting
		{
			System.out.println("input num");
			int a=sc.nextInt();
					if(a>range)
					{
						System.out.println("Your input exceeds the range please enter once again");
						i--;
					}
					else
					{
						hs.add(a);
					}
		}
		for(int i=0;i<=range;i++)
		{
			if(!hs.contains(i))
				System.out.print(i+", ");
		}
		// TODO Auto-generated method stub

	}

}
