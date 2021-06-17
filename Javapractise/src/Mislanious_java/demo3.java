package Mislanious_java;

import java.io.IOException;

public class demo3 {

	public static void main(String[] args) {
		try {
			System.out.println("kakakkak");
			Thread.sleep((long)('b'));
		}
		catch(InterruptedException e) {}
		
		try {System.out.println("ty e");
		System.out.println(10/0);}
		catch (Exception e) {
			System.out.println("catch");
			return;
			// TODO: handle exception
		}
		finally
		{
			System.out.println("am finally");
		}
		// TODO Auto-generated method stub

	}

}
