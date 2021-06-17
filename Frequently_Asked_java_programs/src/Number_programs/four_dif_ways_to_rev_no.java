package Number_programs;

import java.util.Scanner;

public class four_dif_ways_to_rev_no {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		int rev=0;
		int temp1 = num;
		int temp2=num;
		//way1
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("reverse is "+rev);
		//way2
		StringBuffer sb= new StringBuffer(String.valueOf(temp1));
		System.out.println(sb.reverse());
		//way3
		String n="";
		while(temp2!=0)
		{
			n=n+temp2%10;
			temp2=temp2/10;
		}
		
	System.out.println(n);
		
		// TODO Auto-generated method stub

	}

}
