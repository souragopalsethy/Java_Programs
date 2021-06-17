package jun_14;

import java.util.Scanner;

public class ze1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many elements to 1st array");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter next element");
			arr[i]=sc.nextInt();
		}
		int mid=arr.length/2;
		int j=1;
		for(int i=0;i<mid;i++)
		{
			int temp=arr[i];
			arr[i]=arr[mid+j];
			arr[mid+j]=temp;
			j++;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		// TODO Auto-generated method stub

	}

}
