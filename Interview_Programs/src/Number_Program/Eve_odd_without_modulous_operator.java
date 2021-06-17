package Number_Program;

import java.util.Scanner;

public class Eve_odd_without_modulous_operator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no");
		int num=sc.nextInt();
		if((num/2)*2==num)
			System.out.println("Even no");
		else
			System.out.println("odd no");
	}

}
