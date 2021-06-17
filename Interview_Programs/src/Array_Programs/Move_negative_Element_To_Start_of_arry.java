package Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Move_negative_Element_To_Start_of_arry {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many element u want to insert an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter "+i+" index element of array");
			arr[i]=sc.nextInt();
			
		}
		System.out.println("array elemnt are before rotating "+Arrays.toString(arr));
		int j=0;
		int arr2[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr2[j]=arr[i];
				j++;
			}
				
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				arr2[j]=arr[i];
				j++;
			}
				
		}
		System.out.println("after moving negative to first are "+Arrays.toString(arr2));
		// TODO Auto-generated method stub

	}

}
