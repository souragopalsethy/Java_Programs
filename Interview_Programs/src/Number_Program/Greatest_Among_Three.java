package Number_Program;

import java.util.Scanner;

public class Greatest_Among_Three {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter three num");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1>num2&&num1>num3)
			System.out.println("num1 "+num1+" is greater");
		if(num2>num1&&num2>num3)
			System.out.println("num2 "+num2+" is greater");
		else
			System.out.println("num3 "+num3+" is greater");

			
		// TODO Auto-generated method stub
		

	}

}
