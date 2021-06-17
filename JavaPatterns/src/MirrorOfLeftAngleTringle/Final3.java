package MirrorOfLeftAngleTringle;
import java.util.*;

public class Final3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=n-i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
