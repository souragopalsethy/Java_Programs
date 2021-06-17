package Arrray_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Remove_Duplicate_unsorted_Array {

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
	 HashSet<Integer> h= new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			h.add(arr[i]);
		}
		System.out.println(h);

	}

}
