package utility;
import java.util.*;

class myct implements Comparator
{
	public int compare(Object a,Object b)
	{
		String  s1=a.toString();
		
		String s2=b.toString();
		int l1=s1.length();
		int l2=s2.length();
	
		if(l1<l2)
			return 1;
		else if(l1>l2) 
			return -1;
		else 
			return s2.compareTo(s1);
	}
}
public class Arraysortdemo2 {

	public static void main(String[] args) {
		ArrayList <String> a=new ArrayList<String>();
		a.add("ss");
		a.add("ssss");
		a.add("xxxxxxx");
		a.add("zzzzzzzzzzz");
		a.add("ppp");
		System.out.println("before sort value is "+a);
		Collections.sort(a, new myct());
		System.out.println("after sort value is "+a);
		
		
		// TODO Auto-generated method stub

	}

}
