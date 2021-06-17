package rough;

public class demo33 {
	public static int m1()
	{
		try
		{
			System.out.println("try");
			
			return 10;
		}
		catch(Exception e)
		{
			System.out.println("catch");
			return 20;
		}
		finally
		{
			System.out.println("finlly");
			//return 30;
		}
	}

	public static void main(String[] args) {
		System.out.println(m1());
		
		// TODO Auto-generated method stub

	}

}
