package Practice;

import java.util.Scanner;

public class Fibonaci_1_n {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        long first=-1;
        long second=1;
        long result=0;
        
        for(int i=1;i<=n;i++)
        {
        	result=first+second;
        	System.out.println(result);
        	first=second;
        	second=result;
        	
        	
        }
		// TODO Auto-generated method stub

	}

}
