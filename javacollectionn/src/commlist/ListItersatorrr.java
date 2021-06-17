package commlist;
import java.util.*;

public class ListItersatorrr {

	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<Object>();
		for(int i=0;i<=100;i++)
		{
			a.add(i);
		}
		ListIterator l=a.listIterator();
		while(l.hasNext())
		{
			Integer i=(Integer)l.next();
			if(i%2!=0)
				l.set(i*i);
		}
		System.out.print(a+" ");
		// TODO Auto-generated method stub

	}

}
