package imp;

import java.util.Scanner;

public class Show_Duplicate_Element {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many elemnt want to add");
		int num=sc.nextInt();
		int arr[]= new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the "+(i+1)+" th elements");
			arr[i]=sc.nextInt();
		}
		System.out.println(" Now Searching for duplicate elements... ");
		int length=arr.length;
		for(int i=0;i<=length-1;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]==arr[j])
				System.out.print(arr[j]+" ");
			}
		}
		
		// TODO Auto-generated method stub

	}

}
