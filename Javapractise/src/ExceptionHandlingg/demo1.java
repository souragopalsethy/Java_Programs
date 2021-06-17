package ExceptionHandlingg;

import java.util.Scanner;

class TooOldException extends RuntimeException
{

	 TooOldException(String s)
	 {
		 super(s);
	 }
}
class TooYoungException extends RuntimeException
{

	 TooYoungException(String s)
	 {
		 super(s);
	 }
}
public class demo1 {

	public static void main(String[] args) {
		//System.out.println("Enter your age");
		Scanner sc= new Scanner(System.in);
		//int n=sc.nextInt();
		boolean b=true;
		while(true)
		{
			System.out.println("Enter your age");
			int n=sc.nextInt();
			if(n<18)
			{
				throw new TooYoungException("you are tooo young please be 18+");
			}
			if(n>60)
			{
				throw new TooOldException("you are tooo budha for this");
			}
			else
			{
				System.out.println("Tu pel sakta he");
				
			}
			System.out.println("D0 u want more time to chek");
			
			String s=sc.next();
			if(s.equalsIgnoreCase("no"))
				break;
			
			
		}
		
		// TODO Auto-generated method stub

	}

}
