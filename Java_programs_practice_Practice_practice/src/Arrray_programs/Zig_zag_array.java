package Arrray_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Zig_zag_array {
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
	 int arr3[]=new int[n+n2];
	 int j=0;
	 int k=0;
	 for(int i=0;i<arr3.length;i++)
	 {
		 if(j<arr1.length)
		 {
			 arr3[i]=arr1[j];
			 j++;
			 i++;
			 
		 }
		 if(k<arr2.length)
		 {
			 arr3[i]=arr2[k];
			 k++;
			 
		 }
	 }
	 System.out.println(Arrays.toString(arr3));
	

}
}
