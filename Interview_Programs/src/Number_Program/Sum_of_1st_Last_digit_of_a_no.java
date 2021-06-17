package Number_Program;

import java.util.Scanner;

public class Sum_of_1st_Last_digit_of_a_no {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the num");
		int num=sc.nextInt();
		int lastdigit=num%10;
		int firstdigit=num;
		while(firstdigit>10)
		{
			firstdigit=firstdigit/10;
		}
		System.out.println("sum of farst and second digit is = "+(firstdigit+lastdigit));
		// TODO Auto-generated method stub

	}

}
