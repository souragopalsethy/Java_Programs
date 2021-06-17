package multithread_2;
class abc{
	abc()
	{
		this.m1();
	}
	abc(String s)
	{
		this.m1();
	}
	public static  void m1()
	{
		System.out.println(" he am mi");
	}
}

public class demo1 extends abc{
	public static void main(String[] args) {
		
	
	abc a= new abc();
	a.m1();


}}
