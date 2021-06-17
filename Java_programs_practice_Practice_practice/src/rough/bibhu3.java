package rough;

import java.util.Scanner;

public class bibhu3 {
	public static int ans=0;
	public static int lessBy10(int a, int b,int c)
	{
		if(a==10||b==10||c==10)
		 {
			 ans=1;
		 }
		 else if((a<b||a<c)||(b<a||b<c)||(c<a||c<b))
		 {
			 ans=0;
		 }
	return ans;	
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three no");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
System.out.println(lessBy10(a, b, c));
		
	}
	
}
