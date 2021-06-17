package Array_Programs;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Majority_Times_Comes_elemnt_in_Array {

	public static void main(String[] args) {
		System.out.println("done by biku// no cpy pastre");
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter how many element u want to insert an array");
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("enter "+i+" index element of array");
				arr[i]=sc.nextInt();
				
			}
			System.out.println("array elemnt are  "+Arrays.toString(arr));
			TreeMap m= new TreeMap();
			for(int i=0;i<arr.length;i++)
			{
				boolean flag=false;
				int count=0;
				for(int j=1+i;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						flag=true;
						count++;	
					}
				}
				if(flag==true)
				{
					m.put(count, arr[i]);
			
				}
			}
			System.out.println(" Higest number of occurance elemnt is "+m.lastEntry().getValue());
		// TODO Auto-generated method stub

	}

}
