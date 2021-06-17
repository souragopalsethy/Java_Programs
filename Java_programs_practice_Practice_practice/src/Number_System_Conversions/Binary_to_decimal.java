package Number_System_Conversions;

import java.util.Scanner;

public class Binary_to_decimal {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numb");
		int a=sc.nextInt();
	int temp=a;
	int output=0;
	int mul=1;
	while(temp!=0)	
	{
	
		int last=temp%10;
	  output=output+last*(mul);
	  mul=mul*2;
	  temp=temp/10;
		
	}
	System.out.println(output);
	}

}
