package Arrray_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Duplicate_Elemnt_arry {
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
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			
			if(al.contains(arr[i]))
			{
				System.out.println("duplicate "+arr[i]);
			}
			al.add(arr[i]);
		}
	}

}
