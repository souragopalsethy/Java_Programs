package String_prg;
import java.util.*;

public class Accivalue_of_char {
	  public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
	    char arr[]=s.toCharArray();
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println("acci value of "+arr[i]+" = "+(int)arr[i]);
	    }
		// TODO Auto-generated method stub

	}

}
