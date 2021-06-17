package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class No_of_occurance_of_each_word {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		String arr[]=s.split("[\\s]");
	HashMap<String, Integer> hm= new HashMap<String, Integer>();
	for(int i=0;i<arr.length;i++)
	{
		int value=1;
		if(hm.containsKey(arr[i]))
		{
			value=hm.get(arr[i]);
			value++;
			hm.replace(arr[i], value);
			
		}
		else
			if(arr[i]!=" ")
			hm.put(arr[i], value);
	}
	System.out.println(hm.toString());
		

	}

}
