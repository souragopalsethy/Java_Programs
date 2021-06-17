package Array_Programs;

import java.util.Scanner;

public class Checking_Array_Is_sorted_or_not {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many elemnt u want to insert");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Eneter array element");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the " +(i+1)+" Elemnt");
			arr[i]=sc.nextInt();
		}
		int ac=0;
		int dc=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
				ac++;
			if(arr[i]>arr[i+1])
				dc++;
		}
		if(ac==arr.length-1)
			System.out.println("Array is sorted in Acending Order");
		else if(dc==arr.length-1)
			System.out.println("Array is sorted in dcending Order");
		else
			System.out.println("Array is not sorted yet");
		
		
		

}
}