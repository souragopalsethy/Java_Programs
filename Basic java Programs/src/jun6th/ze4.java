package jun6th;

import java.util.Scanner;

public class ze4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        int par=0;
        int sum=0;
        int p=n;
       
        while(p!=0)
        {
        	par=p%10;
        	
        	int fact=1;
            for(int i=par;i>=2;i--)
            {
            	fact=fact*i;
            }
            //System.out.println(fact);
            sum=sum+fact;
            p=p/10;
        	
        }
        if(sum==n)
        System.out.println("String no");
        else
        	System.out.println("not Strong no");
        
       
        	
		// TODO Auto-generated method stub

	}

}
