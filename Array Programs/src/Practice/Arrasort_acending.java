package Practice;

import java.util.Scanner;

public class Arrasort_acending {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many elemnt want to add");
		int num=sc.nextInt();
		int arr[]= new int[num+1];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the "+i+"elements");
			arr[i]=sc.nextInt();
		}
		for(int l=0;l<num-2;l++)
		{
		
		for(int j=0;j<num-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		}
		for(int k=0;k<num;k++)
		{
			System.out.print(arr[k]+",");
		}
		// TODO Auto-generated method stub

	}

}
