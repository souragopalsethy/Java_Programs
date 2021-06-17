package Aeray_Program;

import java.util.Scanner;

public class Kth_height_elemnt {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= {1,5,2,4,3};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("Enter kth highest tem");
		int highest=sc.nextInt();
		System.out.println("Enter kth lowest tem");
		int lowest=sc.nextInt();
		
		System.out.println("kth highest is "+arr[highest-1]);
		System.out.println("kth lowest "+arr[lowest-1]);
		
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
