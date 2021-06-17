package map;
import java.util.*;

public class hasmapdemo {

	public static void main(String[] args) {
		HashMap h= new HashMap();
		h.put(2, "222");
		h.put(5, "255jkdbskjdbx2");
		h.put(8, ",zmcbkjscsklc2");
		h.put(4, "behckjdnc2");
		System.out.println(h);
		Set s=h.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
			
		{
			Map.Entry m =(Map.Entry)itr.next();
			System.out.println(m.getKey()+"  "+ m.getValue());
			if(m.getKey().equals(4))
			{
				m.setValue("sourav");
			}
			
		}
		System.out.println(h);
		
		
		// TODO Auto-generated method stub

	}

}
