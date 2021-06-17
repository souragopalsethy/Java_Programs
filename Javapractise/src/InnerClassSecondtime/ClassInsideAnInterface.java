package InnerClassSecondtime;
interface demo
{
	public void m1();
	class a implements outer
	{
		public void m1()
		{
			System.out.println("1st implemntation");
		}
	}
	 class b implements outer// here interface memeber can only be public
	{
		public void m1()
		{
			System.out.println("2nd implemntation");
		}
	}
}

public class ClassInsideAnInterface {

	public static void main(String[] args) {
		demo.a o1= new demo.a();
		o1.m1();
		demo.b o2= new demo.b();
		o2.m1();
		// TODO Auto-generated method stub

	}

}
