package Array_seaching;

import java.util.Scanner;

public class Binary_Seaching {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many elemnt u want to insert");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Eneter array elemnt in sorted order");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to search");
		int element=sc.nextInt();
		int index=binsearch(arr,0,arr.length-1,element);
		System.out.println("Index of "+element+" is "+index);	

	}
	public static int binsearch(int arr[],int low,int high,int element)
	{
		if(low<=high)
		{
			int mid=low+((high-low)/2);
			if(arr[mid]==element)
			{
				return mid;
			}
			if(element>arr[mid])
			{
				binsearch( arr, mid+1, high, element);
			}
			if(element<arr[mid])
				binsearch( arr, low, mid-1, element);
			
		}
	return-1;
	}
	

}
