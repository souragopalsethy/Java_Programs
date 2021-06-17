package String_prg;
import java.util.*;
class myctr implements Comparator
{
	public int compare(Object a,Object b)
	{
		String s1=a.toString();
		String s2=b.toString();
		int l1=s1.length();
		int l2=s2.length();
		if(l1>l2)
			return 1;
		else if(l1<l2)
			return -1;
		else
			return s1.compareTo(s2);
		
	}
}
public class Sort_word_of_string_length_wise {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("how many string u want to enter");
		int n=sc.nextInt();
		System.out.println("Enter String one by one");
		Set s= new TreeSet(new myctr());
		for(int i=1;i<=n;i++)
			s.add(sc.nextLine());
		Iterator itr=s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		// TODO Auto-generated method stub

	}

}
