package Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_Of_next_two_element {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter ho many array elemnt u wantt to Store");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+ i +" element");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the elemnt woz next two elemnt sum u want to find");
		int element=sc.nextInt();
		int pos=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
				pos=i;
				
		}
        System.out.println("Arr is "+Arrays.toString(arr));
		if(pos==arr.length-1)
		{
			System.out.println("Sorry u enterd elemnt is at last of array");
		}
		else {
		int sum=arr[pos+1]+arr[pos+2];
		System.out.println("sum of next to elemnt of "+element+" is = "+sum);
		}
		

	}

}
