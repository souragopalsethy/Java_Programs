package Java_lang_obj;
import java.lang.reflect.*;

public class Get_classs {

	public static void main(String[] args) {
		String s= new String();
		Class a=s.getClass();
		System.out.println(a.getName());
		Method[] m= a.getDeclaredMethods();
		int count=1;
		for(Method m1:m)
		{
			System.out.println(count+"."+m1.getName());
			count++;
		}
		
	
		// TODO Auto-generated method stub

	}

}
