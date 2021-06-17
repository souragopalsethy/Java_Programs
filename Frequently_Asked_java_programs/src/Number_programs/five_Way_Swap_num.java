package Number_programs;

import java.util.Scanner;

public class five_Way_Swap_num {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a and b");
		int a=sc.nextInt();
		int b=  sc.nextInt();
		System.out.println("before swaping a = "+a+" b= "+b);
		//logic-1
		/*int c=b;
		 b=a;
		 a=c;
		 System.out.println("After swaping a = "+a+" b= "+b);*/
		//.logic 2
		 /*a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("After swaping a = "+a+" b= "+b);*/
		//logic 3
		 /*a=a*b;
		 b=a/b;
		 a=a/b;
		 System.out.println("after swaping a = "+a+" b= "+b);*/
		//logic 4
		/*a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after swaping a = "+a+" b= "+b);*/
		//logic 5
		b=(a+b)-(a=b);
		System.out.println("after swaping a = "+a+" b= "+b);

	}

}
