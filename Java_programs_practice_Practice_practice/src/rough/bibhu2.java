package rough;

import java.util.Scanner;

public class bibhu2 {
public static int m1(int a, int b, int c)
{
 if(a==10||b==10||c==10)
 {
	 return 1;
 }
 else if((a<b||a<c)||(b<a||b<c)||(c<a||c<b))
 {
	 return 0;
 }
return 100;
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three no");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
System.out.println(m1(a,b,c));
	}

}
