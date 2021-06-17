package Number_Program;

import java.util.Scanner;

public class fibonacci_Series {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(first);
			int next=first+second;
			first=second;
			second=next;
			
		}
		
		// TODO Auto-generated method stub

	}

}
