package Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Delete_An_Element_Particular_Index_Of_Array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many elemnt u want to inser in an array");
		int n= sc.nextInt();
		int arr1[]= new int[n];
		System.out.println("Eneter the elemt to array");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("1st array elemnt before deleting \n"+Arrays.toString(arr1));
		System.out.println("enter the index whic u want to delete");
		int index=sc.nextInt();
		int arr2[]=new int[n-1];
		for(int i=0;i<arr1.length-1;i++)
		{
			if(i<index)
				arr2[i]=arr1[i];
			else
				arr2[i]=arr1[i+1];
				
		}
		System.out.println("2nd Array after deleting elemenet at index  "+index+" is   \n "+Arrays.toString(arr2));
		
		
		// TODO Auto-generated method stub

	}

}
