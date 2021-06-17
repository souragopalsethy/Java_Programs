package Number_Program;

import java.util.Scanner;

public class Sum_digit_of_a_no {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the num");
		int a=sc.nextInt();
		for(int num=1;num<=a;num++)
		{
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
		 sum=sum+temp%10;
		 temp=temp/10;
			
		}
		System.out.println("sum of digit "+num+" is= "+sum);
		}
		// TODO Auto-generated method stub

	}

}
