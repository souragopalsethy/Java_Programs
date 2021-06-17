package Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Difference_Between_Elemnts_Of_Array {
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
		System.out.println("array elemnt are  "+Arrays.toString(arr));
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
			
		}
		System.out.println("max ele is "+max+" Min ele is "+min);
		System.out.println("maximum differnce between elemnt is "+(max-min));
	}

}
