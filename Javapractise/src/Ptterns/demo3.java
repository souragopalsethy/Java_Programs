package Ptterns;
import java.util.Scanner;
public class demo3 {

	public static void main(String[] args) {
		//@ souragopal 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n ");
		int n=sc.nextInt();
		int sum=0;
		int jsum=0;
		for(int i=0;i<=n;i++)
		{
		
			for(int j=0;j<i;j++)
			{
				jsum=jsum+j;
			}
			sum=sum+i+jsum;
			jsum=0;
			
		}
		System.out.println(sum);
		//@ souragopal 
		

	}

}
