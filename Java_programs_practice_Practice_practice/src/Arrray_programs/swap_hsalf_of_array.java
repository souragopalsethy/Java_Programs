package Arrray_programs;

import java.util.Arrays;
import java.util.Scanner;

public class swap_hsalf_of_array {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many elements to 1st array");
		int n1=sc.nextInt();
		int arr1[]= new int[n1];
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Enter next element");
			arr1[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		int mid=arr1.length/2;
		for(int i=0;i<mid;i++)
		{
			int temp=arr1[i];
			arr1[i]=arr1[mid+1+i];
			arr1[mid+1+i]=temp;
			
		}
		System.out.println(Arrays.toString(arr1));
	}

}
