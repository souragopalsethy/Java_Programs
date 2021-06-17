package String_prg;

import java.util.Scanner;


public class Identify_Element_is_Alphabet_number_or_Special_char {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the ");
	     String s=sc.next();
	     if(s.charAt(0)>='a'&&s.charAt(0)<='z'||s.charAt(0)>='A'&&s.charAt(0)<='Z')
	    	 System.out.println("apbhabet");
	     else if(s.charAt(0)>=48&&s.charAt(0)<=57)
	    	 System.out.println("its a digit");
	     else
	    	 System.out.println("undefined char");
		// TODO Auto-generated method stub

	}

}
