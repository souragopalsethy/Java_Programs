package InnerClasses;

public class MethodLocalInner {
	int x=20;
	static int y=40;
	
	public void m1()
	{
		int p=20;
		final int q=20;
		
		class inner{
			public void m2(int a,int b)
			{
				System.out.println(a+b);
			
				
			}
			public void m3()
			{
				
				System.out.println(x+y);
				System.out.println(p+q);
				
			}
	     		

			
		}
		inner i=new inner();
		i.m2(10, 20);
		i.m2(100, 200);
		i.m2(1000, 2000);
		i.m3();
	}
	static void m2()
	{
		class inner1
		{
			public void m5()
			{
				System.out.println(y);
				//System.out.println(x);//we cant ascces due to m2 is static
			}
		}
	}

	public static void main(String[] args) {
		new MethodLocalInner().m1();
		new MethodLocalInner().m2();
		
		
		// TODO Auto-generated method stub

	}

}
