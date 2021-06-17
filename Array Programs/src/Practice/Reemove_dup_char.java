package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Reemove_dup_char {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many elemnt want to add");
		int num=sc.nextInt();
		int arr[]= new int[num];
		int temp[]=new int[num];
		int count=0;
		int l=0;
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the "+i+" elements");
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int m=0;m<arr.length;m++)
		{
			System.out.print(arr[m]);
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
