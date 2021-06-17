package externalisation;

import java.io.*;

/**
 *
 * @author Souragopal
 */
public class SerializationExternalisationDemo1 implements Externalizable {

    String name;
    int i;
    int j;
    public SerializationExternalisationDemo1()
    {
        
    }
       public SerializationExternalisationDemo1(String name,int i,int j)
       {
           this.i=i;
          this.j=j;
          this.name=name;
       }
    public void writeExternal(ObjectOutput os)throws IOException
    {
        os.writeObject(name);
        os.writeObject(i);
        
    }
    public void readExternal(ObjectInput is)throws IOException,ClassNotFoundException
    {
        name=(String)is.readObject();
        i=(Integer)is.readObject();// durga sirs read int not working
    }
    public static void main(String[] args)throws Exception {
         System.out.println("serilize demo 2--  customorised serialed encrypt password");
        FileOutputStream fos= new FileOutputStream("C:\\Users\\Souragopal\\Desktop\\javatf\\demo3.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
         SerializationExternalisationDemo1 d1=new SerializationExternalisationDemo1("soura",1,2);
         oos.writeObject(d1);
         System.out.println("deserialisation staretd");
         FileInputStream fis= new FileInputStream("C:\\Users\\Souragopal\\Desktop\\javatf\\demo3.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        SerializationExternalisationDemo1 d2=(SerializationExternalisationDemo1)ois.readObject();
        System.out.println(" "+d2.name+"  "+d2.i+" "+d2.j);
        
        // TODO code application logic here
    }
    
}

