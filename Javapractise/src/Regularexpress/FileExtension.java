package Regularexpress;
import java.util.regex.*;
import java.io.*;
import java.util.*;

public class FileExtension {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\Souragopal\\Desktop\\javatf");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file extension: ");
		String ip=sc.next();
		Pattern p= Pattern.compile("[a-zA-Z0-9_&.]+[.]"+ip);
		String [] s=f.list();
		boolean val=true;
		int count=0;
		for(String s1:s)
		{
			Matcher m=p.matcher(s1);
			if(m.find()&&m.group().equals(s1))
			{
				count++;
				System.out.println(s1);
			}
			else
			val=false;
		
		}
		if (val==false)
			System.out.println("invalid file extension");
		System.out.println("Total files are: "+count);
		// TODO Auto-generated method stub

	}

}
