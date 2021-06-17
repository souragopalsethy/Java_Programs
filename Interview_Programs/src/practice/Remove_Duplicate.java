package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicate {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("eneter "+i+" elemnt");
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before removing duplicate is "+Arrays.toString(arr));
		int k=0;
		int count=0;
		for(int i=0;i<size;i++)
		{
			for(int j=1+i;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					int temp=arr[size-1];
					arr[size-1]=arr[j];
					arr[j]=temp;
					size--;
					System.out.println("matched");
							
					
				}
			}
		}
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);

	}

}
