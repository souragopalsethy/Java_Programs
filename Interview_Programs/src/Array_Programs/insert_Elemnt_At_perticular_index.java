package Array_Programs;

import java.util.Scanner;

public class insert_Elemnt_At_perticular_index {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter arr size");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println("Entr nxt");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Which index u want to insert");
		int index=sc.nextInt();
		System.out.println("Which value u want to insert");
		int value=sc.nextInt();
		for(int i=arr.length-1;i>index;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[index]=value;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
