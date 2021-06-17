package practice;

import java.util.Scanner;

public class asignment {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter arr size");
		int size=sc.nextInt();
	    System.out.println("Enter the sum u want to find");
	    int sum=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter next");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
