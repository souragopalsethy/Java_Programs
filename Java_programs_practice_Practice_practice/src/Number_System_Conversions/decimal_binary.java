package Number_System_Conversions;

import java.util.Scanner;

public class decimal_binary {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numb");
		int a=sc.nextInt();
	int temp=a;
	String num="";
	while(temp!=0)
	{
		num=temp%2+num;
		temp=temp/2;
	}
	System.out.println(num);
	}

}
