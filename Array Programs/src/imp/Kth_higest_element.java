package imp;

import java.util.Scanner;

public class Kth_higest_element {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many elemnt want to add");
		int num=sc.nextInt();
		int arr[]= new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the "+i+"elements");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Which elemnts You want to find");
		int Index_Find=sc.nextInt();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+",");
		}
		System.out.println();
		System.out.println(Index_Find+" th Higest element is "+arr[(arr.length)-Index_Find]);
		// TODO Auto-generated method stub

	}

}
