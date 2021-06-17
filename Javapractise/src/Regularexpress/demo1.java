package Regularexpress;
import java.util.regex.*;
import java.util.*;

public class demo1 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the string:- ");
		String str=sc.next();
		System.out.println("enter the pattern:- ");
		String patt=sc.next();
		Pattern p=Pattern.compile(patt);
		Matcher m=p.matcher(str);
		while(m.find())
		{
			System.out.println("the start index is :- "+m.start()+"  End index is "+(m.end()-1)+" element is "+m.group());
		}
		
		// TODO Auto-generated method stub

	}

}
