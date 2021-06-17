package MultiThreadingg;
class display1
{
	public  void show(String s)
	{
		synchronized(this) {
		for( int i=0;i<10;i++)
		{
			System.out.println(" weellcome  ");
	    
		try {Thread.sleep(1000);} catch(Exception e) {e.printStackTrace();}
		
		System.out.print(s);
		}
		}
	}
}
class son1 extends Thread
{
  display1 d;
  String s;
  son1(display1 d,String s)
  {
	  this.d=d;
	  this.s=s;
  }
  public void run()
  {
	  d.show(s);
  }
}
public class SyncBlockk {

	public static void main(String[] args) {
		display1 d=new display1();
		son1 t1=new son1(d,"soura");
		son1 t2=new son1(d,"biku");
		t1.start();
		t2.start();
		// TODO Auto-generated method stub

	}

}
