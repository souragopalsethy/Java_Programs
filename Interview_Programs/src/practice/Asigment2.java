package practice;
class parent
{
	static{
		System.out.println("static");
	}
	 public void foo()
		{
			System.out.println("parent");
		}
		
		
}

public class Asigment2 extends parent{

	
	public static void main(String[] args) {
		parent p =new parent();
		p.foo();
		parent p1 =new parent();
		p1.foo();
		
		
		// TODO Auto-generated method stub

	}

}
