package Number_Programs;

import java.util.Scanner;

public class Dec_Bin {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Binary num");
		int n=sc.nextInt();
		String decimal="";
		int temp=n;
		while(temp!=0)
		{
			int last=temp%2;
			decimal=last+decimal;
			temp=temp/2;
		}
		System.out.println(decimal);	}

}
