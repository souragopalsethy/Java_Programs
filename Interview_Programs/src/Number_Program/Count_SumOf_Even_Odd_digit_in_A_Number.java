package Number_Program;

import java.util.Scanner;

public class Count_SumOf_Even_Odd_digit_in_A_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		int temp=n;
		int even=0;
		int odd=0;
		
		while (temp!=0)
		{
			int last=temp%10;
			if(last%2==0)
				even++;
			else
				odd++;
			temp=temp/10;
		}
		System.out.println("The total even digit in num > "+even);
		System.out.println("The total odd  digit in num > "+odd);

		// TODO Auto-generated method stub

	}

}
