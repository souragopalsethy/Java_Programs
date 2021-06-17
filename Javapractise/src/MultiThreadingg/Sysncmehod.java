package MultiThreadingg;
class dis
{
	public synchronized void show(String s) 
	{
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println(s);
		}
	}
	
}
class ct3 extends Thread
{
	dis d;
	String s=null;
	ct3(dis d,String s)
	{
		this.d=d;
		this.s=s;
	}
	public void run() {
		d.show(s);
	}
}

public class Sysncmehod {

	public static void main(String[] args) throws Exception {
		dis d= new dis();
		
		ct3 o1=new ct3(d,"soura");
		ct3 o2=new ct3(d,"chki");
		o1.start();
		o2.start();
		// TODO Auto-generated method stub

	}

}
