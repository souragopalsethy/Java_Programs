package jun_13th;

import java.util.Scanner;

public class Zig_Zag_Array {

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
		int length=arr1.length+arr2.length;
		
		int arr3[]= new int[length];
		int j=0;
		int k=0;
		for(int i=0;i<arr3.length;i++)
		{
			if(j<arr1.length)
			{
				arr3[i]=arr1[k];
				i++;
				j++;
			}
			if(k<arr2.length)
			{
				arr3[i]=arr2[k];
				//i++;
				k++;
			}
			
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
