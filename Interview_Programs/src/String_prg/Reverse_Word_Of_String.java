package String_prg;

import java.util.Scanner;

public class Reverse_Word_Of_String {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enethe the string with space");
		String s=sc.nextLine();
	    String [] str=s.split(" ");
	    for(int i=str.length-1;i>=0;i--)
	    	System.out.print(str[i]+" ");
		// TODO Auto-generated method stub

	}

}
