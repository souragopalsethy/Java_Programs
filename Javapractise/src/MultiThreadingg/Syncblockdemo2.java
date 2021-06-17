package MultiThreadingg;
class di
{
	public  void show(String s) 
	{
		synchronized (this) {
			
		
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println(s);
		}
		}
	}
	
}
class ct4 extends Thread
{
	dis d;
	String s=null;
	ct4(dis d,String s)
	{
		this.d=d;
		this.s=s;
	}
	public void run() {
		d.show(s);
	}
}


public class Syncblockdemo2 {

	public static void main(String[] args) {
		dis d= new dis();
		ct4 o1=new ct4(d,"biku");
		ct4 o2=new ct4(d,"soura");
		o1.start();
		o2.start();
		
		// TODO Auto-generated method stub

	}

}
