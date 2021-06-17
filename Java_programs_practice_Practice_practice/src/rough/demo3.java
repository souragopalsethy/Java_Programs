package rough;
interface abc
{
	public void show();
}
class b
{
	public void show()
	{
		System.out.println("class b");
	}
}
public class demo3 extends b implements abc {
	public static void main(String[] args) {
		demo3 o =new demo3();
		o.show();
	}
}
