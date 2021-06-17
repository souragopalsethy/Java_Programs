package Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_two_num_close_to_zero {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter ho many array elemnt u wantt to Store");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter"+ i +" element");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Closet elemnt to zero are = "+(arr[1]+arr[2]));
		
		
	}

}
