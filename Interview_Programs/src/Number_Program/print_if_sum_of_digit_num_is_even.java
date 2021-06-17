package Number_Program;

import java.util.Scanner;

public class print_if_sum_of_digit_num_is_even {

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
		if(sum%2==0)
		{
			System.out.println("sum of digit of num even is "+num);
		}
		}
		// TODO Auto-generated method stub

	}

}
