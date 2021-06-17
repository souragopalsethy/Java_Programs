package patterns;
import java.util.*;

public class Number_tringle {
	public static void main(String[] args) {
		
	
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter n");
	int n= sc.nextInt();
	int a=1;
	for(int i=0;i<n;i++)
	{
		int p=a;
		for(int j=0;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++)
		{
			System.out.print(p);
			p--;
		}
		for(int l=1;l<=i;l++)
		{
			System.out.print(l+1);
		}
		System.out.println();
		a++;
	}
	

}
}