package InnerClassSecondtime;
interface outer
{
	public void m1();
	interface inner
	{
		public void m2();
	}
}

public class InterfaceInsideAnInterface {

	public static void main(String[] args) {
		System.out.println("Bikus approach");
		outer o =new outer()
		{
			public void m1()
			{
				System.out.println("Inside outer ");
			}
		};
		outer.inner i =new outer.inner()
				{
			public void m2()
			{
				System.out.println("Inside Inner");
			}
				};
		o.m1();
		i.m2();
		// TODO Auto-generated method stub

	}

}
