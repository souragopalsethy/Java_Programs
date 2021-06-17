package jun6th;

import java.util.Scanner;

public class ze3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        	int z=i;
        int s=0;
        int k=0;
        while (i!=0)
        {
            s=z%10;
            k=(k*10)+z;
            z=z/10;
        }
        if(k==i)
        {
            System.out.println(i);
        }
    
		
		// TODO Auto-generated method stub

	}
	}

}
