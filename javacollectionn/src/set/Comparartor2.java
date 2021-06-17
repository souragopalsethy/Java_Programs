package set;
import java.util.*;
 class my implements Comparator
 {
	 public int compare(Object a,Object b)
	 {
		 Integer i1=(Integer)a;
		 Integer i2=(Integer)b;
		 if(i1%2==0)
			 return 1;
		 else
			 return -1;
		 
		 
	 }
 }

public class Comparartor2 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new my());
		for(int i=1;i<=10;i++)
		{
			t.add(i);
		}
		System.out.println(t);
		// TODO Auto-generated method stub

	}

}
