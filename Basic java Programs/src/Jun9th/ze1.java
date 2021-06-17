package Jun9th;

import java.util.Scanner;

public class ze1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enete the n");
		int n=sc.nextInt();
		String num="";
		 int temp=n;
	      while(temp!=0)
	      {
	    	  int rev=temp%2;
	    	  num=num+rev;
	    	  temp=temp/2;
	      }
	      System.out.println(num);
		// TODO Auto-generated method stub

	}

}
