package Array_Programs;

import java.util.Scanner;

public class Odd_pos_Elment_print {

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
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
			i++;
		}
		// TODO Auto-generated method stub

	}

}
