package Practice;

import java.util.Scanner;
import java.util.*;

public class Higest_Lowest {

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
		Arrays.sort(arr);
		System.out.println("Higest elemet of array is "+arr[num]);
		System.out.println("Lowest elemet of array is "+arr[1]);
		// TODO Auto-generated method stub

	}

}
