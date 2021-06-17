package jun17;

import java.util.Scanner;

public class ze1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s= sc.nextLine();
		char [] arr=s.toCharArray();
		int sum=0;
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=46&&arr[i]<=57)
			{
				sum= sum+(arr[i]-48);
			}
		}
		System.out.println("Sum of numeric is "+sum);
		
		// TODO Auto-generated method stub

	}

}
