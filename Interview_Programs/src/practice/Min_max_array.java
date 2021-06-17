package practice;

import java.util.Scanner;

public class Min_max_array {

	public static void main(String[] args) {

			Scanner sc= new Scanner(System.in);
			System.out.println("Enter arr size");
			int n=sc.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("Entr nxt");
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<arr.length;i++)//here am printting array
			{
				System.out.print(arr[i]+",");
			
			}
			System.out.println();
			int max=arr[0];
			int min=arr[0];
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]<min)
					min=arr[i];
				if(arr[i]>max)
					max=arr[i];
			}
			System.out.println("max element is "+max);
			System.out.println("min element is "+min);
		// TODO Auto-generated method stub

	}

}
