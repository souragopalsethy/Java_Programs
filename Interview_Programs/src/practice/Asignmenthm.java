package practice;
import java.util.*;

public class Asignmenthm {

	public static void main(String[] args) {
		String arr[]= {"ravi","raju","amit","bob","ravi","amit"};
		HashMap m= new HashMap();
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			int val=1;
			if(m.containsKey(arr[i]))
			{
			  val=(int)m.get(arr[i]);
			 val++;
			}
			m.put(arr[i], val);
		}
		System.out.println(m);
		// TODO Auto-generated method stub

	}

}
