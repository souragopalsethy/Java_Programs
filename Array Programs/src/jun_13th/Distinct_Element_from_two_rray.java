package jun_13th;

import java.util.Scanner;

public class Distinct_Element_from_two_rray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many elements to 1st array");
		int n1=sc.nextInt();
		int arr1[]= new int[n1];
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Enter next element");
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter how many elements to 2st array");
		int n2=sc.nextInt();
		int arr2[]= new int[n2];
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("Enter next element");
			arr2[i]=sc.nextInt();
		}
		System.out.println("distinct elements are");
	for(int i=0;i<arr1.length;i++)
	{
		boolean flag=true;
		for(int j=0;j<arr2.length;j++)
		{
			if(arr1[i]==arr2[j])
			{
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println(arr1[i]);
		}
	}
	for(int i=0;i<arr2.length;i++)
	{
		boolean flag=true;
		for(int j=0;j<arr1.length;j++)
		{
			if(arr2[i]==arr1[j])
			{
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.print(arr2[i]+" ");
		}
	}
		// TODO Auto-generated method stub

	}

}
