package Number_Program;

import java.util.Scanner;

public class print_1_n_withoutloo_using_recursion {
	public static void demo(int n)
	{
		if(n<=10)
		{
			System.out.println(4);
			
		}
		demo(n+1);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the n");
		int n=sc.nextInt();
		int i=0;
		demo(n);
		
		// TODO Auto-generated method stub

	}

}
