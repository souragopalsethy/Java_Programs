package rough;
import java.util.*;

public class String_count {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String name=sc.nextLine();
		name=name.toLowerCase();
		 HashMap<Character, Integer> m= new HashMap< Character,Integer>();
		 for(int i=0;i<name.length();i++)
		 { 
			if(m.containsKey(name.charAt(i)))
			{
				int temp=m.get(name.charAt(i));
				 temp++;
				 m.replace(name.charAt(i), temp);
			}
			else
				if(name.charAt(i)!=' ')
				m.put(name.charAt(i), 1);
		 }
	        Set res=m.entrySet();	
	        Iterator itr=res.iterator();
	        while(itr.hasNext())
	        {
	        	System.out.println(itr.next());
	        }
	       
			
		}
		}
		
	

