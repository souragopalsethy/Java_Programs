package Number_Program;

import java.util.Scanner;

public class Perfect_square_or_not {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter the num ");
		int num=sc.nextInt();
		int count=0;
		int i;
		for(i=1;i<num;i++)
		{
			if(i*i==num)
			{
				System.out.println("its a perfect number of square "+i);
				break;
			}
			
		}
		if(i==num)
			System.out.println(" its not a perfect number square ");
		
		// TODO Auto-generated method stub

	}

}
