package Number_Program;

import java.util.Scanner;

public class Sum_of_Event_Digit_of_a_no {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numner ");
		int num=sc.nextInt();
		int temp=num;
		int evensum=0;
		int oddsum=0;
		String even="";
		String odd="";
		while(temp!=0)
		{
			int last=temp%10;
			if(last%2==0)
			{
				evensum=evensum+last;
				even=even+","+last;
			}
			else
			{
				oddsum=oddsum+last;
				odd=odd+","+last;
			}
			temp=temp/10;
		}
		System.out.println("sum of even no of digit "+even+"  = "+evensum);
		System.out.println("sum of odd no of digit "+ odd+"   = "+oddsum);
		
	}

}
