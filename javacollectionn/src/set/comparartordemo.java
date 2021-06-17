package set;

import java.util.Comparator;
import java.util.TreeSet;
class myc implements Comparator
{
	public int compare(Object a,Object b)
	{ 
		String s1=(String)a;
		String s2=(String)b;
		int l1=s1.length();
		int l2=s2.length();
		if(l1>l2)
			return -1;
		else 
			return 1;
		
		
		
		
	}
}
public class comparartordemo {
public static void main(String[]args)

{
	TreeSet t=new TreeSet(new myc());
	t.add("Soura");
	t.add("soumya");
	t.add("bibnhu");
	t.add("swetty sharma");
	System.out.println(t);
}
}
