package externalisation;
import java.io.*;


public class demo5 implements Externalizable{
	
	int a;
	int b;
	public demo5()
	{
		
	}
	demo5(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	 public void writeExternal(ObjectOutput os)throws IOException
	    {
	        os.writeObject(a);
	       
	        
	    }
	    public void readExternal(ObjectInput is)throws IOException,ClassNotFoundException
	    {
	        
	         a=(Integer)is.readObject();// durga sirs read int not working
	    }
	public static void main(String[] args)throws Exception {
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Souragopal\\Desktop\\javatf\\ext1.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		demo5 obj=new demo5(10,20);
		oos.writeObject(obj);
		FileInputStream fis=new FileInputStream("C:\\Users\\Souragopal\\Desktop\\javatf\\ext1.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
	     demo5 o=(demo5)ois.readObject();
		System.out.println("val is "+ o.a);
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Souragopal\\Desktop\\javatf\\ext1.txt"));
		String s=br.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=br.readLine();
		}
		// TODO Auto-generated method stub

	}

}
