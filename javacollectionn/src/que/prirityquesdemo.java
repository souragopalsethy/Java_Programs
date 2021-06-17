package que;
import java.util.*;

public class prirityquesdemo {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue(new myc());
		p.offer(5);
		p.offer(7);
		p.add(7);
		p.offer(7);
		System.out.println(p);
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