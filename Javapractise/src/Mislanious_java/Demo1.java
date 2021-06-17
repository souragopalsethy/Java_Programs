package Mislanious_java;
import java.util.*;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<Integer > a=new ArrayList<Integer>();
		a.add(1);
		System.out.println(a.add(1));
		System.out.println(a.add(1));
		System.out.println(a.remove(1));
		System.out.println(a);
		System.out.println(a.set(1, 5));
		System.out.println(a);
		Vector< Integer> v =new Vector<Integer>();
		v.add(4);
		v.add(2);
		System.out.println(v.removeElement(0));
		v.removeAllElements();
		System.out.println(v);
		Stack s= new Stack();
		System.out.println(s.push(7));
		s.add(7);
		
	}

}
