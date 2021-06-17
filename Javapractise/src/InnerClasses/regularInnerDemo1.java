package InnerClasses;


public class regularInnerDemo1 {
	int x=20;
	static int y=100;
	class inner{
		public void m1()
		{
			System.out.println("Inner class method");
			System.out.println(regularInnerDemo1.this.x+"  " +regularInnerDemo1.this.y);
			
		}
		public void m2()
		{
			System.out.println("Inner class method 2");
		}
		
	}
	public void m3()
	{
		inner o=new inner();
		o.m2();
	  
	}

	public static void main(String[] args) {
	new regularInnerDemo1().new inner().m1();
	new regularInnerDemo1().m3();
		// TODO Auto-generated method stub

	}

}
