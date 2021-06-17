package Aeray_Program;

import java.util.Scanner;

public class Deleting_Elemnt_From_perticular_index {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	int arr[]= {1,2,3,4,5,};
	System.out.println("Enter index to delete");
	int index=sc.nextInt();
	int i=0;
	for(;i<arr.length;i++)
	{
		if(arr[i]==index)
		{
			break;
		}
	}
	for(int j=i;j<arr.length-1;j++)
	{
		arr[j]=arr[j+1];
	}
	for(int k=0;k<arr.length-1;k++)
	{
		System.out.println(arr[k]);
	}

}
}