package Jun_5th;

import java.util.Scanner;

public class ze3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=10;j++) 
			{
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
				
			
		}
		// TODO Auto-generated method stub

	}

}
