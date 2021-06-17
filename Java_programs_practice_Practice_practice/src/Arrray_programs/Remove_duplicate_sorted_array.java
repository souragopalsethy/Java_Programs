package Arrray_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_duplicate_sorted_array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter arr sizse");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("eter next");
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Your arry is "+Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				for(int j=i+1;j<arr.length-1;j++)
				{
					arr[j]=arr[j+1];
				}
				n--;
			}
		}
		System.out.println("after removing duplicate array is");
		for(int i=0;i<=n;i++)
			System.out.print(arr[i]+" ");
		// TODO Auto-generated method stub

	}

}
