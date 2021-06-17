package Regularexpress;
import java.util.regex.*;
import java.util.*;
	

public class demo3 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[789][0-9]{9}");
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter");
		String s=sc.next();
		Matcher m=p.matcher(s);
		while(m.find())
		{
		System.out.println(m.group());
		if(m.group().equals(s))
		{
			System.out.println("valid phone number");
		}
		else
		{
			System.out.println("invalid phone number");
		}
		}
	
		
		// TODO Auto-generated method stub

	}

}
