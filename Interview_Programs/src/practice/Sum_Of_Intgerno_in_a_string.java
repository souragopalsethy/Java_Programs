package practice;

import java.util.Scanner;

public class Sum_Of_Intgerno_in_a_string {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int sum=0;
		char arr[]=s.toCharArray();
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]>=49&&arr[i]<=57)
			{
			 //int b=Integer.parseInt(String.valueOf(arr[i])); //discoverd by biku
			 //sum=sum+b;
				//or this
			 sum=sum+ new Integer(String.valueOf(arr[i]));
			 //String.valueof method used to conver char value to string
			 //here Interger argument type is string so i used valueofmethod
			}
		}
		System.out.println("Sum of all intger in a given String is "+sum);
		// TODO Auto-generated method stub

	}


}
