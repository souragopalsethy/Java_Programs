package Biku_Derived_programs;

import java.util.Scanner;

public class print_char_if_accivalue_is_even {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
	    char arr[]=s.toCharArray();
	    for(int i=0;i<arr.length;i++)
	    {
	    	int n=(int)arr[i];
	    	if(n%2==0)
	    	System.out.println("even acci value of "+arr[i]+" = "+(int)arr[i]);
	    	//System.out.println("acci value of "+arr[i]+" = "+(int)arr[i]);
	    }
		// TODO Auto-generated method stub

	}

}
