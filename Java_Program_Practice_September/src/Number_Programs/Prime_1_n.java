package Number_Programs;

import java.util.Scanner;


public class Prime_1_n {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enete n");
		int a=sc.nextInt();
		 for(int n=2;n<a;n++)
		 {
		int i;
		for( i=2;i<n;i++)
		{
			if(n%i==0)
				break;
		}
		if(i==n)
			System.out.println(n);
		//else 
			//System.out.println("not prime");
	}
}

}
