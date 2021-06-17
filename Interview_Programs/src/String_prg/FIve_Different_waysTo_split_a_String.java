package String_prg;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class FIve_Different_waysTo_split_a_String {

	public static void main(String[] args) {
		String s= "soura-gopal-sethy";
		
		
		///way1
		String arr1[]=s.split("-");
		for (String st : arr1) {
			System.out.println(st);
		}
		///way2
		StringTokenizer st= new StringTokenizer(s,"-");
		System.out.println("using srtring tokenizer");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}
		//way3
		System.out.println("using regex method");
		List<String> l=Pattern.compile("-").splitAsStream(s).collect(Collectors.toList());
	  for (String str: l) {
		System.out.println(str);
		
			}
		// TODO Auto-generated method stub

	}

}
