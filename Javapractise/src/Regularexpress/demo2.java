package Regularexpress;
import java.util.regex.*;
import java.util.regex.Pattern;

public class demo2 {

	public static void main(String[] args) {
		Pattern p =Pattern.compile("\\d");
		Matcher m=p.matcher("sjkcedkc11  vvhjcf55");
		while(m.find())
		{
			System.out.println(m.start()+"  " +m.group());
		}
		
		// TODO Auto-generated method stub

	}

}
