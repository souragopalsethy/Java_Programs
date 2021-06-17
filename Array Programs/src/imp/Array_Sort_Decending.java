package imp;

import java.util.Scanner;

public class Array_Sort_Decending {

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
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)//here i do coz after each niteration we got higest elemnt at lsst
			{
				if(arr[j]<arr[j+1])
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
		

	}

}
