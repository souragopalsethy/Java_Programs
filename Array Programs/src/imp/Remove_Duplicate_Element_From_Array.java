package imp;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicate_Element_From_Array {

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
		System.out.println(" Now removinng duplicate begins ");
		int len=arr.length;
		for(int i=0;i<=len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[len-1];
					len--;//this is important step
				}
			}
		}
		System.out.println("New Array After removing duplicate ");
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
