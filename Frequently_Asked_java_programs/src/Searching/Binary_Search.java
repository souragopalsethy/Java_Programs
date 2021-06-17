package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter ho many elent u want to stire in an array");
		int n= sc.nextInt();
		System.out.println("Enter arry elemnt on by one in soretd order");
		int arr[]=new int[n];
				for(int i=0;i<n;i++)
		{
			System.out.println("enter the "+i+" elemnet");
			arr[i]=sc.nextInt();
			
		}
				System.out.println("enter the elemnt to search");
				int element=sc.nextInt();

		System.out.println(Arrays.toString(arr));
		int lower=0;
		int higher=arr.length-1;
		binserch(lower,arr.length-1,arr,element);
		
		
		

	}
	public static void binserch(int lower,int higher,int arr[],int element)
	{
	if(lower<=higher)
	{
		int mid=lower+((higher-lower)/2);
		if(arr[mid]==element)
			System.out.println(" index of "+element+" is "+mid);
		else if(element>arr[mid])
			 binserch(mid+1,higher,arr,element);
		else if(element<arr[mid])
			 binserch(lower,mid-1,arr,element);
	}
	}
	

}
