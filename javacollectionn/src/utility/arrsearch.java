package utility;
import java.util.*;

class myc implements Comparator
{
	public int compare(Object a,Object b)
	{
		int c=(Integer)a;
		int d=(Integer)b;
		if(c>d)
			
			return -1;
		else
			return 1;
		
		
	}
}
public class arrsearch {
	public static void main(String[] args) {
	
		ArrayList a=new ArrayList();
		a.add(8);
		a.add(13);
		a.add(4);
	    a.add(18);
	    a.add(5);
	    a.add(15);
	    System.out.println(a);
	    Collections.sort(a,new myc());
	    System.out.println(a);
	    System.out.println(Collections.binarySearch(a,77,new myc()));
	    
		
	}

}
