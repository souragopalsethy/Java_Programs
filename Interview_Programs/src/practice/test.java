package practice;
abstract class pa
{
	pa()
	{
		

	}
	public static int x=10;
	public void m1()
	{
		System.out.println("first");
		
	}
}
interface a
{
	
}
public class test extends pa{
	public void m1()
	{
		System.out.println("child");
		
	}
	public static void main(String[] args) {
		pa t= new test();
		t.m1();
		pa.x=15;
		System.out.println(pa.x);
	
	}
}
