package String_Program;

import java.util.*;

public class Most_occuring_Character {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ebter the String");
		String s=sc.nextLine();
		TreeMap< Character, Integer> hs= new TreeMap<Character,Integer>();
		int max=1;
		char ele=' ';
		char [] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{int val=0;
			if(hs.containsKey(arr[i]))
			{
				val=(Integer)hs.get(arr[i]);
				hs.replace(arr[i], val+1);
				if(val+1>max)
				{
					max=val+1;
					ele=arr[i];
				}
				
			}
			else
			{
				hs.put(arr[i], 1);
				if(val+1>max)
				{
					max=val+1;
					ele=arr[i];
				}
			
			}
		}
		System.out.println("-------");
		System.out.println(max+" "+ele);
	}

}
