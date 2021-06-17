package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class reverse_a_string {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter string: ");
	String s=sc.nextLine();
	char arr[]=s.toCharArray();
	for(int i=0;i<arr.length/2;i++)
	{
		char temp=arr[i];
		arr[i]=arr[arr.length-1-i];
		arr[arr.length-1-i]=temp;
	}
	System.out.println(Arrays.toString(arr));
	
}

}
