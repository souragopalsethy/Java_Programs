package Number_programs;

import java.util.Scanner;

public class Strong_number_1_n {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numb");
		int a=sc.nextInt();
		for(int n=1;n<=a;n++)
		{
		int temp=n;
		int factsum=0;
		while(temp!=0)
		{
			int last=temp%10;
			int fact=1;
			for(int i=1;i<=last;i++)
				fact=fact*i;
			factsum=factsum+fact;
			temp=temp/10;
				
			
		}
		if(factsum==n)
			System.out.println(factsum);

	}
	}

}
