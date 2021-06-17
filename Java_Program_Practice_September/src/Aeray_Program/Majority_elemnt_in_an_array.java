package Aeray_Program;

import java.util.*;

public class Majority_elemnt_in_an_array {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("now Enter element one by one");
		TreeMap<Integer, Integer> tm= new TreeMap<Integer, Integer>();
		for(int i=0;i<n;i++)
		{
			int key=sc.nextInt();
			if(tm.containsKey(key)==true)
			{
				int val=tm.get(key);
				tm.replace(key, val+1);
			}
			else
			{
				tm.put(key, 1);
			}
		}
		System.out.println(tm);
		int notfound=0;
		for (Map.Entry<Integer, Integer> entry: tm.entrySet()) {
			if(entry.getValue()>n/2==true)
				System.out.println("majority Elemnt is "+entry.getKey());

			
		}

	
	}

}
