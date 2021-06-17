package map;
import java.util.*;
public class tressetdemo {

	public static void main(String[] args) {
		TreeMap t=new TreeMap(new myc());
		t.put(4, "souya");
		t.put(7, "ssjcbskjcbskjcbya");
		t.put(2, "sos,mcn,ya");
		t.put(79, "hjvghj");
		System.out.println(t);
		
		
		// TODO Auto-generated method stub

	}

}
class myc implements Comparator
{
	public int compare(Object a,Object b)
	{
		Integer i1=(Integer)a;
		Integer i2=(Integer)b;
		return i2.compareTo(i1);
	}
}