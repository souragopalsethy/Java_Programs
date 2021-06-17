package Regularexpress;
import java.util.regex.*;
import java.io.*;

public class MobileNumberExtractor {

	public static void main(String[] args)throws Exception {
		PrintWriter pw= new PrintWriter("C:\\Users\\Souragopal\\Desktop\\javatf\\moblile no extractor output.txt");
		
		Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Souragopal\\Desktop\\javatf\\moblile no extractor input.txt"));
		String line=br.readLine();
		int count=0;
		while(line!=null)
		{
			Matcher m=p.matcher(line);
			while(m.find())
			{
				pw.println(m.group());
				
				count++;
			}
			line=br.readLine();
		}
		pw.flush();
		pw.close();
		br.close();
		System.out.println("File write succesfull"+"\n total file read is "+count);
		// TODO Auto-generated method stub

	}

}
