package Serialisation;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class two implements Serializable
{
 String name="sourav";
 transient String pwd="jaymaa";
 private void ObjectWrite(ObjectOutputStream os)throws Exception
 {
	 //os.defaultWriteObject();
	 String epwd="123"+pwd;
	 os.defaultWriteObject();
	 os.writeObject(epwd);
 }
 private void ObjectRead(ObjectInputStream is)throws Exception
 {
	is.defaultReadObject();
	String epwd=(String)is.readObject();
	pwd=epwd.substring(6);
	
 }
}

public class demo3 {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Souragopal\\Desktop\\javatf\\seri2.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		two obj=new two();
		oos.writeObject(obj);
		FileInputStream fis=new FileInputStream("C:\\Users\\Souragopal\\Desktop\\javatf\\seri2.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
	     two o=(two)ois.readObject();
		System.out.println("hey decription name is :- "+o.name+"\n"+"  decrpted password is :- "+ o.pwd);
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Souragopal\\Desktop\\javatf\\seri2.txt"));
		String s=br.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=br.readLine();
		}

		
		// TODO Auto-generated method stub

	}

}
