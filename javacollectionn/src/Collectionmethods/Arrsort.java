package Collectionmethods;
import java.util.*;

public class Arrsort {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		for(int i=1;i<100;i++)
		{
			a.add(i);
		}
		System.out.println(a);
		Collections.sort(a,new myc());
		System.out.println(a);
		System.out.println(Collections.binarySearch(a,15,new myc()));
		// TODO Auto-generated method stub

	}

}
class myc implements Comparator
{
	public int compare(Object a,Object b)
	{
		Integer i1=(Integer)a;
		Integer i2=(Integer)b;
	
		if(i1<i2)
			return 1;
		else 
			return -1;
	}
}