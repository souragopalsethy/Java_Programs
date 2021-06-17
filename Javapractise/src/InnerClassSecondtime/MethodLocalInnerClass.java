package InnerClassSecondtime;

public class MethodLocalInnerClass {
	public void m1()
	{
		class inner{
			public void m2(int a,int b)
			{
				System.out.println("Sum is "+(a+b));
			}
		}
		inner i= new inner();
		i.m2(10, 20);
		System.out.println("Tghousand line off m1 metghod code");
		i.m2(11, 888);
		System.out.println("Another 100 line of code");
		i.m2(1111, (int)('a'));//hey am just tring
	}

	public static void main(String[] args) {
		MethodLocalInnerClass o= new MethodLocalInnerClass();
		o.m1();
		
		// TODO Auto-generated method stub

	}

}
