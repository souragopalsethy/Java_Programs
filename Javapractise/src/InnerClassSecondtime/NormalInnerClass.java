package InnerClassSecondtime;

public class NormalInnerClass {
	int x=10;
    static int y=20;
    class inner
    {
    	public void m1()
    	{
    		System.out.println(NormalInnerClass.this.x);
    		System.out.println(NormalInnerClass.this.y);
    	}
    }
    public void m2()
    {
    	inner i= new inner();
    	System.out.println("acces inside istance area");
    	i.m1();
    }

	public static void main(String[] args) {
		new NormalInnerClass().new inner().m1();//way 1
		 NormalInnerClass.inner i= new  NormalInnerClass().new inner();
		 i.m1();
		 new  NormalInnerClass().m2();
		 
		// TODO Auto-generated method stub

	}

}
