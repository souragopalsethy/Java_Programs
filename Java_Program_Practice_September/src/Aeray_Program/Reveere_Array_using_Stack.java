package Aeray_Program;

import java.util.*;

public class Reveere_Array_using_Stack {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("enter element one by one");
		int arr[]= new int[n];
		Stack<Integer> s= new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			int input=sc.nextInt();
			arr[i]=input;
			s.push(input);	
		}
		System.out.println("before reverse arr is+ \n"+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.pop();
		}
		System.out.println("After reverse arr is+ \n"+Arrays.toString(arr));
		
	}

}
