package Aeray_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Swap_half_Array {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int arr []= {1,2,3,4,5};
	int mid=arr.length/2+1;
	for(int i=0;i<arr.length/2;i++)
	{
		int temp=arr[i];
		arr[i]=arr[mid+i];
		arr[mid+i]=temp;
		
		
	}
	System.out.println(Arrays.toString(arr));
}

}
