package MultiThreadingg;
class biku extends Thread
{
int total=0;
public void run()
{
	synchronized(this)
	{
	for(int i=0;i<10;i++)
	{
		total=total+i;
		 try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	this.notify();
	}
}
}
public class WaitNotifyy {
	

	public static void main(String[] args)throws Exception {
		biku b=new biku();
		b.start();
		synchronized(b)
		{
		b.wait(500);
		System.out.println(b.total);
		}
		
		 
		
		// TODO Auto-generated method stub

	}

}
