package String_prg;

public class Swaping_Of_two_string {

	public static void main(String[] args) {
		String a="soura";
		String b="biku";
		System.out.println("Before swaping a is "+a+" and b is "+b);
	   a=a+b;
	   b=(a.substring(0,a.length()-b.length()));
	   a=(a.substring(b.length(),a.length()));
	   System.out.println(a);
	   System.out.println(b);

	}

}
