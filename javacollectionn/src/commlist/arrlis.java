package commlist;
import java.util.*;

public class arrlis {

	public static void main(String[] args) {
		ArrayList <Object>a=new ArrayList<Object>();
		for(int i=0;i<=10;i++)
		{
			a.add(i);
		}
		System.out.println(a);
		Iterator itr=a.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			if(i%2==0)
			itr.remove();
		}
		
		
		// TODO Auto-generated method stub

	}

}
