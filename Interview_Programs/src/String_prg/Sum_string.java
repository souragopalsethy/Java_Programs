package String_prg;

import java.util.Scanner;

public class Sum_string {

	public static void main(String[] args) {
		System.out.println("This program is done by bikus own logic");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st string");
		String a=sc.next();
		System.out.println("Enter 2nd string");
		String b=sc.next();
		Integer i1=new Integer(a);
		Integer i2=new Integer(b);
		int result=i1+i2;
		System.out.println("Sum is "+result);

	}

}
