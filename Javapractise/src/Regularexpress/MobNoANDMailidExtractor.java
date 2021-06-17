package Regularexpress;
import java.util.regex.*;
import java.io.*;


public class MobNoANDMailidExtractor {

	public static void main(String[] args)throws Exception {
    PrintWriter pw= new PrintWriter("C:\\Users\\Souragopal\\Desktop\\javatf\\moblile no extractor output.txt");
    PrintWriter pw2= new PrintWriter("C:\\Users\\Souragopal\\Desktop\\javatf\\o.txt");
	
		
		Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Pattern p2=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
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
			
			Matcher m2=p2.matcher(line);
			while(m2.find())
			{
			
				pw2.println(m2.group());
				
				count++;
			}
			
			line=br.readLine();
		}
		pw.flush();
		pw.close();
		pw2.flush();
		pw2.close();
		br.close();
		System.out.println("File write succesfull"+"\n total file read is "+count);
		// TODO Auto-generated method stub

	}

}
