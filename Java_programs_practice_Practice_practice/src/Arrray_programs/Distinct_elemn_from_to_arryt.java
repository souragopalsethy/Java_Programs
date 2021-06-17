package Arrray_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Distinct_elemn_from_to_arryt {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter arr sizse of 1st array");
		int n=sc.nextInt();
		int arr1[]= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("eter next");
			arr1[i]=sc.nextInt();
			
		}
		System.out.println("Your arry is "+Arrays.toString(arr1));
		System.out.println("Enter arr sizse of 2st array");
		int n2=sc.nextInt();
		int arr2[]= new int[n2];
		for(int i=0;i<n;i++)
		{
			System.out.println("eter next");
			arr2[i]=sc.nextInt();
			
		}
		System.out.println("Your arry is "+Arrays.toString(arr2));
	
		for(int i=0;i<arr1.length;i++)
		{		boolean a=true;

			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					a=false;
				}
			}
			if(a==true)
				System.out.print(arr1[i]+" ");
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			boolean b=true;
			for(int j=0;j<arr1.length;j++)
			{
				if(arr2[i]==arr1[j])
				{
					b=false;
				}
			}
			if(b==true)
				System.out.print(arr2[i]+" ");
		}
		
	}

}
