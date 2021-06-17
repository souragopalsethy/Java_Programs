package rough;
class abcd
{
	protected static void m1()
	{
		System.out.println("abcd");
	}
}
public class demo5 extends abcd {
	public static void m1()
	{
		System.out.println("child");
	}
	public static void main(String[] args) {
		demo5 o= new demo5();
		o.m1();
		abcd a= new demo5();
		a.m1();
		int i=10;
		long l=10;
		System.out.println((4^5)+5+(4|5));
		
	}
	public void m()
	{
	System.out.print("k");
	}

}
