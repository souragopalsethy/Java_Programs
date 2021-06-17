package Mislanious_java;
import java.util.*;
class myc11 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return -s1.compareTo(s2);
	}
	
}

public class demo2 {
	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>(new myc11());
		
		t.add("soura");
		t.add("go");
		t.add("ssssssssw");
		System.out.println(t);
		for (String s:t)//here am iterate
		{
			System.out.println(s);
		}
		
	}

}
