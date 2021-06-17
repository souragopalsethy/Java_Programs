package Mislanious_java;
import java.util.*;

public class tmaop {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String [] arr=s.split(" ");
		int value=1;
		
		TreeMap<String, Integer> t=new TreeMap< String,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(t.containsKey(arr[i]))
			{
				int key=t.get(arr[i]);
				t.replace(arr[i], key+1);
			}
			else
			{ 
				if(arr[i]!=" ")
				{
				t.put(arr[i], value);
				}
			}
		}
		System.out.println(t);
		
	}

}
