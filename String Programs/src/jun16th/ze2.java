package jun16th;

import java.util.*;

public class ze2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap m= new HashMap();
		System.out.println("Enter the string");
		String s= sc.nextLine();
		char [] arr=s.toCharArray();
		for(int i=0;i<arr.length-1;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
			     	count++;
					
				}
			}
			m.put(arr[i], count);
			
		}
		Set se= m.entrySet();
		Iterator itr=se.iterator();
		while(itr.hasNext())
		{
			Map.Entry mp=(Map.Entry)itr.next();
			System.out.println(mp.getKey()+" has occured "+mp.getValue());
		}
		// TODO Auto-generated method stub

	}

}
