package Arrray_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Kth_Higesht_kth_lowest {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter arr sizse");
	int n=sc.nextInt();
	int arr[]= new int[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("eter next");
		arr[i]=sc.nextInt();
		
	}
	System.out.println("Your arry is "+Arrays.toString(arr));
	System.out.println("enter kth lowest trm to find");
	int lowest=sc.nextInt();
	System.out.println("enter kth highest trm to find");
	int highest=sc.nextInt();
	Arrays.sort(arr);
		System.out.println(lowest+" th term is "+arr[lowest-1]);
	System.out.println(highest+" th term is "+arr[highest-1]);

	
	}

}
