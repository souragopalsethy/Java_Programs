package MultiThreadingg;

class display 
{
	public synchronized void show(String s)
	{
		for( int i=0;i<=10;i++)
		{
			System.out.println(" weellcome  ");
	    
		try {Thread.sleep(1000);} catch(Exception e) {e.printStackTrace();}
		
		System.out.print(s);
		}
	}
}
class son extends Thread
{
  display d;
  String s;
  son(display d,String s)
  {
	  this.d=d;
	  this.s=s;
  }
  public void run()
  {
	  d.show(s);
  }
}
public class Syncmethodd {

	public static void main(String[] args) {
		display d=new display();
		son t1=new son(d,"soura");
		son t2=new son(d,"biku");
		t1.start();
		t2.start();
		
		// TODO Auto-generated method stub

	}

}
