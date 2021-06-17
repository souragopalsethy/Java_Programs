package Aeray_Program;
import java.util.*;

public class Next_Greater_elemnt_of_array {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("enter element one by one");
		int arr[]= new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
	    }
		System.out.println("Original Array is "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			int next=-1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					next=arr[j];
					break;
				}
					
			}
			System.out.println(arr[i]+" "+next);
			
		}
		
	}

}
