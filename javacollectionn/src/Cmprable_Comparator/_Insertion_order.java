package Cmprable_Comparator;
import java.util.*;

class myc8 implements Comparator
{
	

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return -1;
		//return 0;
	}
}
public class _Insertion_order {
	

	public static void main(String[] args) {
		TreeSet s= new TreeSet(new myc8());
		s.add(5);
		s.add(8);
		s.add(1);
		s.add(2);
		System.out.println(s);
		
		// TODO Auto-generated method stub

	}

}
