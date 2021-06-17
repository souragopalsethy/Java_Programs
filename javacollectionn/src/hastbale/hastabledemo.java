package hastbale;
import java.util.Comparator;
import java.util.Hashtable;

public class hastabledemo {

	public static void main(String[] args) {
		Hashtable h=new Hashtable(11);
		h.put(new test(15), "sourav");
		h.put(new test(2), "sojbwkjdav");
		h.put(new test(8), "jejav");
		h.put(new test(7), "sov");
		h.put(new test(4), "somya");
		System.out.println(h);
		// TODO Auto-generated method stub

	}

}
class test 
{
	int i;
	test(int i)
	{
	this.i=i;
	}

public int hashCode()
{
	return i;
}
public String toString()
{
	return i+"";
}
}