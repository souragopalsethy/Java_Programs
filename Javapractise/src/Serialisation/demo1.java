package Serialisation;
import java.io.*;
class one implements Serializable
{
	int a=10;
	transient int b=20;
}

public class demo1 {

	public static void main(String[] args)throws Exception {
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Souragopal\\Desktop\\javatf\\seri1.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		one obj=new one();
		oos.writeObject(obj);
		FileInputStream fis=new FileInputStream("C:\\Users\\Souragopal\\Desktop\\javatf\\seri1.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		one o=(one)ois.readObject();
		System.out.println(o.a+" "+ o.b);
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Souragopal\\Desktop\\javatf\\seri1.txt"));
		String s=br.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=br.readLine();
		}

		
		// TODO Auto-generated method stub

	}

}
