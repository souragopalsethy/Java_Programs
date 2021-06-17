package demo;
import java.util.*;

public class shop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter company name");
		String s=sc.next();
		Tv b=factory.model(s);
		b.audio();
		b.display();
		

		// TODO Auto-generated method stub

	}

}
