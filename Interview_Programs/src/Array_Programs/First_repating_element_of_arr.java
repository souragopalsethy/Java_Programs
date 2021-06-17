package Array_Programs;

import java.util.Scanner;

public class First_repating_element_of_arr {

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
			for(int j=1+i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("ist duplicate oocurance of char is > "+arr[i]);
					return;//this will return  to caller of method not going to execute further
				}
			}
		}
		
		// TODO Auto-generated method stub

	}

}
