package Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Left_Rotate_An_Array {

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
			int first=arr[0];
			for(int i=1;i<arr.length;i++)
			{
				arr[i-1]=arr[i];
				if(i==arr.length-1)
					arr[i]=first;
				
			}
		
		System.out.println("Elemnts of array are after Rotating right "+Arrays.toString(arr));
		// TODO Auto-generated method stub

	}

}
