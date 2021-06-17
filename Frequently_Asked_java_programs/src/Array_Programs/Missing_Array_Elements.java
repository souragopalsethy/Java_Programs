package Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Missing_Array_Elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elemnt u weant to add ");
		int n= sc.nextInt();
		System.out.println("entyer the range of elemnt");
		int range=sc.nextInt();
		int arr[]= new int[n];
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
						arr[i]=a;
					}
		}
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++)
		{
			sum1=sum1+arr[i];
		}
		for(int i=1;i<=range;i++)
			sum2=sum2+i;
		
		
System.out.println("missing no of array is "+(sum1-sum2));
	}

}
