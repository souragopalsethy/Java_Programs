package prprties;
import java.util.*;
import java.io.*;

public class Properdemo {

	public static void main(String[] args) throws Exception{
		FileInputStream fos=new FileInputStream("C:\\Users\\Souragopal\\Desktop\\javatf\\key val.txt");
		Properties p=new Properties ();
		p.load(fos);
		System.out.println(p);
		String s=p.getProperty("3");
		System.out.println(s);
		p.setProperty("3", " seta  param magia loka madarchod sala");
		FileOutputStream fis= new FileOutputStream("C:\\Users\\Souragopal\\Desktop\\javatf\\key val.txt");
		p.store(fis, "Updated by biku");
		FileReader f=new FileReader("C:\\Users\\Souragopal\\Desktop\\javatf\\key val.txt");
		BufferedReader b=new BufferedReader(f);
		String t=b.readLine();
		while(t!=null)
		{
			System.out.println(t);
			t=b.readLine();
		}
		
		
	
		
		
		
		// TODO Auto-generated method stub

	}

}
