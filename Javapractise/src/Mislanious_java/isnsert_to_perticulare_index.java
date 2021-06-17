package Mislanious_java;

import java.util.Arrays;
import java.util.Scanner;

public class isnsert_to_perticulare_index {
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
    System.out.println("enter index");
    int index=sc.nextInt();
    System.out.println("Enter element");
    int element=sc.nextInt();
   int arr[]=new int[5];
for(int i=0;i<4;i++ )
{
	arr[i]=sc.nextInt();
}
int j=1;
System.out.println(Arrays.toString(arr));

	
	for(int i=arr.length-1;i>index;i--)
	{
		arr[i]=arr[arr.length-1-j];
		j++;
	}
	arr[index]=element;
	System.out.println(Arrays.toString(arr));
	
	
	
	
}}