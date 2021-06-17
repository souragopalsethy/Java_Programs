package Jun9th;

import java.util.Scanner;

public class Swap_of_two_no {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enete the i");
		int i=sc.nextInt();
		System.out.println("Enete the j");
		int j=sc.nextInt();
		System.out.println( "before swap i="+i+" j="+j);
		int temp=i;
		i=j;
		j=temp;
		System.out.println( "after swap i="+i+" j="+j);
		
		// TODO Auto-generated method stub

	}

}
